package org.example.ObserverPattern.service;

public interface Subject {
    void registerUsers(Observer observer);

    void removeUsers(Observer observer);

    void notifyUsers();
}
