package org.example.StrategyPattern.service.impl;

import org.example.StrategyPattern.service.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}
