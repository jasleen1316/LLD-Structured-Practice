package com.jasleen.lld.medium.LibrarySystem;

import java.util.List;

public class LibraryService {
    private BookManager bookManager;
    private UserManager userManager;

    public LibraryService(){
        bookManager = new BookManager();
        userManager = new UserManager();
    }

    public void addBooks(List<Book> books){
        bookManager.addBooks(books);
    }

    public void removeBooks(List<Book> books){
        bookManager.removeBooks(books);
    }

    public void addUser(User user){
        userManager.addUser(user);
    }

    public void removeUser(User user){
        userManager.removeUser(user);
    }

    public void issueBook(Member member, String bookId ){
        bookManager.issueBook(member, bookId);
    }

    public void returnBook(Member member, String bookId){
        bookManager.returnBook(member, bookId);
    }

}
