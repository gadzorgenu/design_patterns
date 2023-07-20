package com.design_patterns.design_pattern.Decorator_design_pattern;

public class PizzaMaker {
    public static void main (String[] args){
        Pizza basicPizza = new TomatoSauce(new Mozarrella(new PlainPizza()));

        System.out.println("Ingredients: "+ basicPizza.getDescription());
        System.out.println("Price: "+ basicPizza.getCost());
    }
}
