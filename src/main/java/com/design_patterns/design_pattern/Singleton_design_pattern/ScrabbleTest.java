package com.design_patterns.design_pattern.Singleton_design_pattern;

import java.util.LinkedList;

public class ScrabbleTest {
    public static void main(String[] args ){

        // Try to make another instance of Singleton
        // This doesn't work because the constructor is private
        // Singleton instanceTwo = new Singleton();

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: "+ System.identityHashCode(newInstance));

        System.out.println(newInstance.getLettersList());

        LinkedList<String> playerOneTiles  = newInstance.getTiles(7);

        System.out.println("Player 1: "+ playerOneTiles);

        System.out.println(newInstance.getLettersList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance 2 ID: "+ System.identityHashCode(newInstance));

        System.out.println(instanceTwo.getLettersList());

        LinkedList<String> playerTwoTiles  = newInstance.getTiles(7);

        System.out.println("Player 2: "+ playerTwoTiles);
    }
}
