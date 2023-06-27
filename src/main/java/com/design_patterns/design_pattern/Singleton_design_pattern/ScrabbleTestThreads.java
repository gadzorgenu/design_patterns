package com.design_patterns.design_pattern.Singleton_design_pattern;

public class ScrabbleTestThreads {
    public  static  void main(String[] args){

        // Create a new Thread created using the Runnable interface
        // Execute the code in run after 10 seconds

        Runnable getTiles = new GetTiles();

        Runnable getTilesAgain = new GetTiles();

        new Thread(getTiles).start();
        new Thread(getTilesAgain).start();
    }
}
