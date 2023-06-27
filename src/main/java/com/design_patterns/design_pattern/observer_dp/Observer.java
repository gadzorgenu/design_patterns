package com.design_patterns.design_pattern.observer_dp;

public interface Observer {
    //this is called when the subject changes
    void update(double ibmPrice, double aaplPrice, double googlePrice);
}
