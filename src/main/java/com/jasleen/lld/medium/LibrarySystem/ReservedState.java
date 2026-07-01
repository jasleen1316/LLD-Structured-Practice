package com.jasleen.lld.medium.LibrarySystem;

public class ReservedState implements AvailabilityStatus{
    @Override
    public void issue(BookCopy book) {
        book.setState(new BorrowedState());
    }

    @Override
    public void returnBook(BookCopy book) {

    }

    @Override
    public void reserve(BookCopy book) {

    }

    @Override
    public String checkStatus() {
        return "RESERVED";
    }
}
