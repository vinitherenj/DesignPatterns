package org.example.StrategyPattern.service.impl;

import org.example.StrategyPattern.service.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("mute quack");
    }
}
