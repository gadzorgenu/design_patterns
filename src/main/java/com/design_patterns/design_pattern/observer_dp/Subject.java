package com.design_patterns.design_pattern.observer_dp;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObserver();
}
