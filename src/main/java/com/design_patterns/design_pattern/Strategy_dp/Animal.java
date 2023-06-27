package com.design_patterns.design_pattern.Strategy_dp;

import lombok.Data;

@Data
public class Animal {
    private String name;
    private int height;
    private Double weight;
    private String favFood;
    private double speed;
    private String sound;

    // Instead of using an interface in a traditional way
    // we use an instance variable that is a subclass of the Flys interface.

    // This is known as Composition : Instead of inheriting an ability through inheritance the class is composed
    // with Objects with the right ability
    // Composition allows you to change the capabilities of objects at run time!


    public Flys flyingType;

    public void setWeight(Double newWeight){
        if(newWeight > 0){
            weight = newWeight;
        }else {
            System.out.println("Enter a positive weight");
        }
    }

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyAbility(Flys newFlyingType){
        flyingType = newFlyingType;
    }

}