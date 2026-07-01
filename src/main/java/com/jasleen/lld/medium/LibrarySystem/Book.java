package com.jasleen.lld.medium.LibrarySystem;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Queue;

public class Book {

    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private List<BookCopy> copies;
    private Queue<Reservation> reservations;

    public Book(String bookId, String title, String author, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<BookCopy> getCopies() {
        return copies;
    }

    public void setCopies(List<BookCopy> copies) {
        this.copies = copies;
    }

    public Queue<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Queue<Reservation> reservations) {
        this.reservations = reservations;
    }
}
