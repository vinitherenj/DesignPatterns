package org.example.ObserverPattern.service;

public interface Observer {
    void update(String pressure, String temperature, String humidity);
}
