package com.design_patterns.design_pattern.factory_pattern;

import lombok.Data;

@Data
public abstract class EnemyShip {

    private  String name;
    private double amtDamage;

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots(){
        System.out.println(getName() + " attacks and does "+ getAmtDamage());
    }
}
