package org.example.StrategyPattern.service.impl;

import org.example.StrategyPattern.service.QuackBehaviour;

public class QuackQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack");
    }
}
