package com.jasleen.lld.medium.LibrarySystem;

public class BorrowedState implements AvailabilityStatus{
    @Override
    public void issue(BookCopy book) {

    }

    @Override
    public void returnBook(BookCopy book) {
        book.setState(new AvailableState());
    }

    @Override
    public void reserve(BookCopy book) {

    }

    @Override
    public String checkStatus() {
        return "BORROWED";
    }
}
