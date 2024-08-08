package org.example.ObserverPattern.service.impl;

import org.example.ObserverPattern.service.Observer;
import org.example.ObserverPattern.service.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private String pressure;
    private String temperature;
    private String humidity;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerUsers(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeUsers(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUsers() {
        updateWeatherData();
    }

    private void updateWeatherData() {
        for (Observer observer: observerList) {
            observer.update(pressure, temperature, humidity);
        }
    }

    public void setMeasurements(String pressure1, String temperature1, String humidity1) {
        pressure = pressure1;
        temperature = temperature1;
        humidity = humidity1;
        notifyUsers();
    }
}
