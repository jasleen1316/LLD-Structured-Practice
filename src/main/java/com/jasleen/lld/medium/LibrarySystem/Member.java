package com.jasleen.lld.medium.LibrarySystem;

import java.util.List;

public class Member implements User{

    private String memberId;
    private List<Issue> activeIssues;
    private List<Reservation> activeReservations;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public List<Issue> getActiveIssues() {
        return activeIssues;
    }

    public void setActiveIssues(List<Issue> activeIssues) {
        this.activeIssues = activeIssues;
    }

    public List<Reservation> getActiveReservations() {
        return activeReservations;
    }

    public void setActiveReservations(List<Reservation> activeReservations) {
        this.activeReservations = activeReservations;
    }
}
