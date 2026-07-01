package com.jasleen.lld.medium.LibrarySystem;

public class BookCopy {

    private String copyId;
    private Book book;
    private AvailabilityStatus state;

    public Book getBook() {
        return book;
    }

    public String getCopyId() {
        return copyId;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setCopyId(String copyId) {
        this.copyId = copyId;
    }

    public AvailabilityStatus getState() {
        return state;
    }

    public void setState(AvailabilityStatus state) {
        this.state = state;
    }
}
