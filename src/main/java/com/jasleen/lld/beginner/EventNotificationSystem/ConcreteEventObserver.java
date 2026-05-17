package com.jasleen.lld.beginner.EventNotificationSystem;

public class ConcreteEventObserver implements EventObserver{
    @Override
    public void update(String event) {
        System.out.println("Received event: " + event);
    }
}
