package com.jasleen.lld.medium.LibrarySystem;

import java.time.Instant;
import java.util.Date;

public class Issue {

    private String issueId;
    private BookCopy bookCopy;
    private Member member;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    public Issue(String issueId, BookCopy bookCopy, Member member, Date issueDate, Date dueDate) {
        this.issueId = issueId;
        this.bookCopy = bookCopy;
        this.member = member;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public void setBookCopy(BookCopy bookCopy) {
        this.bookCopy = bookCopy;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
