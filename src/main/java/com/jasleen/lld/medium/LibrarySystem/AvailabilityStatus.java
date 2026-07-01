package com.jasleen.lld.medium.LibrarySystem;

public interface AvailabilityStatus {

    void issue(BookCopy book);
    void returnBook(BookCopy book);
    void reserve(BookCopy book);
    String checkStatus();

}
