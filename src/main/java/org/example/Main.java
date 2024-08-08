package org.example;

import org.example.ObserverPattern.service.Observer;
import org.example.ObserverPattern.service.impl.CurrentConditionsDisplayElement;
import org.example.ObserverPattern.service.impl.WeatherData;
import org.example.StrategyPattern.Duck;
import org.example.StrategyPattern.MallardDuck;
import org.example.StrategyPattern.RegularDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.performQuack();

        Duck duck2 = new RegularDuck();
        duck2.performFly();
        duck2.performQuack();
        **** STRATEGY PATTERN ****
        */

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplayElement currentConditionsDisplayElement = new CurrentConditionsDisplayElement(weatherData, "23", "24");
        weatherData.setMeasurements("55", "65", "11");
//        currentConditionsDisplayElement.display();
    }
}