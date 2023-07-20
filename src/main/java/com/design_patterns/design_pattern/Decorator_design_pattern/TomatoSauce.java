package com.design_patterns.design_pattern.Decorator_design_pattern;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding sauce");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost(){
        return tempPizza.getCost() +.30;
    }
}
