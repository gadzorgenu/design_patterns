package com.design_patterns.design_pattern.Strategy_dp;

public class Bird extends Animal{
    public Bird(){
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}