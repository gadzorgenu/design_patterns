package com.design_patterns.design_pattern.factory_pattern;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args){
//        EnemyShip theEnemy = null;
//        Scanner userInput = new Scanner(System.in);
//
//        String enemyShipOption = "";
//
//        System.out.println("What type of ship? (u /R)");
//
//        if(userInput.hasNextLine()){
//            enemyShipOption = userInput.nextLine();
//        }
//
//        if(enemyShipOption.equals("U")){
//            theEnemy = new UFOEnemyShip();
//        }else if (enemyShipOption.equals("R")){
//            theEnemy = new RocketEnemyShip();
//        }

        //Creating dynamic enemy ships
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? (U / R/ B)");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            if(theEnemy != null){
                doStuffEnemy(theEnemy);
            }else{
                System.out.println("Enter U,R or B next time");
            }
        }
    }

    public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
