package com.jasleen.lld.medium.LibrarySystem;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class BookManager {

    private BookCatalog catalog;

    public BookManager(){
        catalog = BookCatalog.getCatalog();
    }

    public void addBooks(List<Book> books){
        books.stream().forEach( book -> catalog.getBooks().put(book.getBookId(), book));
    }

    public void removeBooks(List<Book> books){
        books.stream().forEach( book -> catalog.getBooks().remove(book.getBookId()));
    }

    public void issueBook(Member member, String bookId) {

        // check availability of copies
        Book book = catalog.getBooks().get(bookId);
        boolean isAvailable = book.getCopies().stream().anyMatch(bookCopy ->
                bookCopy.getState().checkStatus().equals("AVAILABLE"));

        // check number of active issues of user
        int numActiveIssues = member.getActiveIssues().size();

        // check if book is already issued
        boolean isIssued = member.getActiveIssues().stream().anyMatch(issue -> issue.getBookCopy().getBook().getBookId().equals(bookId));
        if(isIssued) return;

        // if available, issue
        if(isAvailable && numActiveIssues < 5){
            BookCopy currCopy = book.getCopies().stream().filter(bookCopy ->
                    bookCopy.getState().checkStatus().equals("AVAILABLE")).findFirst().get();

            Issue issue = new Issue(UUID.randomUUID().toString(), currCopy, member, new Date(), new Date(System.currentTimeMillis()+1000000));
            currCopy.getState().issue(currCopy);
            member.getActiveIssues().add(issue);
        }
        // if not available, reserve
        else{

            Reservation reservation = new Reservation(UUID.randomUUID().toString(),
                    book, member, new Date(), new Date(System.currentTimeMillis()+1000000), ReservationState.PENDING);
            member.getActiveReservations().add(reservation);

        }
    }

    public void returnBook(Member member, String bookId) {

        // check for late return and fee calculation
        Book book = catalog.getBooks().get(bookId);
        Issue issue = member.getActiveIssues().stream()
                .filter(issue1 -> issue1.getBookCopy().getBook().getBookId().equals(bookId)).findFirst().get();

        Date dueDate = issue.getDueDate();
        if(dueDate.before(new Date())){
            // fine strategy + collection
        }
        issue.setReturnDate(new Date());
        issue.getBookCopy().getState().returnBook(issue.getBookCopy());
        member.getActiveIssues().remove(issue);

        // check for book reservations
        if(!book.getReservations().isEmpty()){
            issueBook(book.getReservations().peek().getMember(), bookId);
            book.getReservations().poll().setStatus(ReservationState.FULFILLED);
        }


    }
}
