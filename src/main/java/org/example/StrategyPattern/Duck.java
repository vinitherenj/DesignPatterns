package org.example.StrategyPattern;

import org.example.StrategyPattern.service.FlyBehaviour;
import org.example.StrategyPattern.service.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }
}
