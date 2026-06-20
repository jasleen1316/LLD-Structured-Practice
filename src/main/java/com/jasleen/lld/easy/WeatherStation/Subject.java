package com.jasleen.lld.easy.WeatherStation;

public interface Subject {

    void registerObserver(Observer obs);
    void unregisterObserver(Observer obs);
    void notifyObserver();

}
