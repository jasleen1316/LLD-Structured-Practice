package com.jasleen.lld.medium.LibrarySystem;

import java.util.Date;

public class Fine {

    private String fineId;
    private Issue issue;
    private Double finePrice;
    private FineStatus status;
    private Date paidDate;

    public String getFineId() {
        return fineId;
    }

    public void setFineId(String fineId) {
        this.fineId = fineId;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public Double getFinePrice() {
        return finePrice;
    }

    public void setFinePrice(Double finePrice) {
        this.finePrice = finePrice;
    }

    public FineStatus getStatus() {
        return status;
    }

    public void setStatus(FineStatus status) {
        this.status = status;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }
}
