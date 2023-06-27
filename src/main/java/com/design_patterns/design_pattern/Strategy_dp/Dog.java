package com.design_patterns.design_pattern.Strategy_dp;

public class Dog extends Animal {
    public void digHole(){
        System.out.println("Dig hole");
    }

    public Dog(){
        super();
        setSound("Bark");
        flyingType = new CantFly();
    }


}