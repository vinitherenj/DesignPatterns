package org.example.StrategyPattern;

import org.example.StrategyPattern.service.impl.FlyWithWings;
import org.example.StrategyPattern.service.impl.QuackQuack;

public class RegularDuck extends Duck {
    public RegularDuck() {
        quackBehaviour = new QuackQuack();
        flyBehaviour = new FlyWithWings();
    }
}
