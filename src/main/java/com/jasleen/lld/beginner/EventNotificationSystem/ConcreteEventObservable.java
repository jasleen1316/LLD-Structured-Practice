package com.jasleen.lld.beginner.EventNotificationSystem;

import java.util.List;

public class ConcreteEventObservable implements EventObservable {

    List<EventObserver> observers;

    @Override
    public void subscribe(EventObserver observer) {
        if(observers == null || observers.isEmpty()){
            observers = new java.util.ArrayList<>();
        }

        observers.add(observer);
    }

    @Override
    public void unsubscribe(EventObserver observer) {
        if(observers.isEmpty()){
            return;
        }

        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for(EventObserver observer : observers){
            observer.update(event);
        }
    }
}
