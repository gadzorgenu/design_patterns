package com.design_patterns.design_pattern.Singleton_design_pattern;

import java.util.LinkedList;

public class GetTiles implements Runnable{

    public void run(){
        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: "+ System.identityHashCode(newInstance));

        System.out.println(newInstance.getLettersList());

        LinkedList<String> playerOneTiles = newInstance.getTiles(7);

        System.out.println("Player : "+ playerOneTiles);
        System.out.println("Got Tiles");
    }
}
