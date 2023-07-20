package com.design_patterns.design_pattern.Decorator_design_pattern;

// Implements the Pizza interface with only the required
// methods from the interface
// Every Pizza made will start as a PlainPizza
public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
