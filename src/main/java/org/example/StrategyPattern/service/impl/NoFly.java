package org.example.StrategyPattern.service.impl;

import org.example.StrategyPattern.service.FlyBehaviour;

public class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No fly. Only Land :(");
    }
}
