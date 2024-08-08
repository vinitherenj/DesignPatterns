package org.example.ObserverPattern.service.impl;

import org.example.ObserverPattern.service.DisplayElement;
import org.example.ObserverPattern.service.Observer;

public class CurrentConditionsDisplayElement implements Observer, DisplayElement {

    private WeatherData weatherData;
    private String pressure;
    private String temperature;

    public CurrentConditionsDisplayElement(WeatherData weatherData, String pressure, String temperature) {
        this.pressure = pressure;
        this.temperature = temperature;
        weatherData.registerUsers(this);
    }

    @Override
    public void display() {
        System.out.println("pressure - " + pressure);
        System.out.println("temperature - " + temperature);
//        System.out.println("humidity - " + );

    }

    @Override
    public void update(String pressure, String temperature, String humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
