package com.jasleen.lld.beginner.EventNotificationSystem;

public interface EventObservable {

    void subscribe(EventObserver observer);
    void unsubscribe(EventObserver observer);
    void notifyObservers(String event);
}
