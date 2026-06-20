package com.jasleen.lld.easy.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    public double temperature, humidiy, pressure;
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void unregisterObserver(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer obs : observers){
            obs.update(temperature, humidiy, pressure);
        }
    }

    public void updateMeasurements(double temperature, double humidiy, double pressure){
        this.temperature = temperature;
        this.humidiy = humidiy;
        this.pressure = pressure;
        notifyObserver();
    }

    public double getTemperature(){
        return temperature;
    }

    public double getHumidiy() {
        return humidiy;
    }

    public double getPressure() {
        return pressure;
    }
}
