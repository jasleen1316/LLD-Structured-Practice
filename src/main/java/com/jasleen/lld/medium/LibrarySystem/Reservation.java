package com.jasleen.lld.medium.LibrarySystem;

import java.time.Instant;
import java.util.Date;

public class Reservation {

    private String reservationId;
    private Book book;
    private Member member;

    public Reservation(String reservationId, Book book, Member member, Date reservationDate, Date reservationExpiryDate, ReservationState status) {
        this.reservationId = reservationId;
        this.book = book;
        this.member = member;
        this.reservationDate = reservationDate;
        this.reservationExpiryDate = reservationExpiryDate;
        this.status = status;
    }

    private Date reservationDate;
    private Date reservationExpiryDate;
    private ReservationState status;

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setStatus(ReservationState status) {
        this.status = status;
    }


    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationExpiryDate(Date reservationExpiryDate) {
        this.reservationExpiryDate = reservationExpiryDate;
    }

    public String getReservationId() {
        return reservationId;
    }

    public Member getMember() {
        return member;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Date getReservationExpiryDate() {
        return reservationExpiryDate;
    }

    public ReservationState getStatus() {
        return status;
    }
}
