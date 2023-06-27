package com.design_patterns.design_pattern.Singleton_design_pattern;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
    private static Singleton firstInstance = null; //It's static because it'll only be available on global basis
    String[] scrabbleLetters ={ "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    private LinkedList<String> lettersList = new LinkedList<String>(Arrays.asList(scrabbleLetters));

    // Used to slow down 1st thread
    static boolean firstThread = true;

    // Only Singleton will be able to instantiate this class
    private Singleton(){  }// the constructor is private to ensure there's only on instance of this class

    // We could make getInstance a synchronized method to force
    // every thread to wait its turn. That way only one thread
    // can access a method at a time. This can really slow everything
    // down though
    // public static synchronized Singleton getInstance()
    public static Singleton getInstance(){
        if (firstInstance == null){
            // This is here to test what happens if threads try to create instances of this class

            if(firstThread){
                firstThread = false;
                Thread.currentThread();

                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

            // Here we just use synchronized when the first object is created
            synchronized (Singleton.class){
                if (firstInstance == null) {
                    firstInstance = new Singleton(); //this is a lazy instantiation because if it is never needed, it'll never be created
                    Collections.shuffle(firstInstance.lettersList);
                }
            }
        }
        return firstInstance;
    }

    public  LinkedList<String> getLettersList(){
        return firstInstance.lettersList;
    }

    public LinkedList<String> getTiles(int howManyTiles){
        LinkedList<String> tilesToSend = new LinkedList<String>();

        // Loop through the LinkedList while adding the starting Strings to the to be returned LinkedList while deleting them from letterList
        for(int i = 0; i <= howManyTiles; i++){
            tilesToSend.add(firstInstance.lettersList.remove(0)); //the remove method chops off the zero index and move everything from the right to the left
        }
        return tilesToSend;
    }
}
