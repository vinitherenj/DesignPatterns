package org.example;

import org.example.StrategyPattern.Duck;
import org.example.StrategyPattern.MallardDuck;
import org.example.StrategyPattern.RegularDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.performFly();
        duck1.performQuack();

        Duck duck2 = new RegularDuck();
        duck2.performFly();
        duck2.performQuack();
    }
}