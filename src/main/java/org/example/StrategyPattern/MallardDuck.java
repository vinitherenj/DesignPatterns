package org.example.StrategyPattern;

import org.example.StrategyPattern.service.impl.MuteQuack;
import org.example.StrategyPattern.service.impl.NoFly;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new NoFly();
    }
}
