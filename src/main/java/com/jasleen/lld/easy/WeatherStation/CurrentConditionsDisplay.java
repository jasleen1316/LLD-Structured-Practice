package com.jasleen.lld.easy.WeatherStation;

public class CurrentConditionsDisplay implements Observer, Display{
    public double temperature, humidity;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this); // self-register
    }

    @Override
    public void display() {
        System.out.println("The current weather conditions are as follows: temperature : " + temperature + " degree C, humidity: " + humidity + "%");
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
