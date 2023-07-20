package com.design_patterns.design_pattern.Decorator_design_pattern;

public class Mozarrella extends ToppingDecorator{
    public Mozarrella(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzarrella";
    }

    public double getCost(){
        return tempPizza.getCost() +.5;
    }
}
