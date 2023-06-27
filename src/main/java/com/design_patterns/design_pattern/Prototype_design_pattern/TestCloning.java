package com.design_patterns.design_pattern.Prototype_design_pattern;

public class TestCloning {
    public static void main(String[] args){
        // Handles routing makeCopy method calls to the right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own memory location

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("Sally Hashcode: "+ System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone Hashcode: "+ System.identityHashCode(System.identityHashCode(clonedSheep)));
    }
}
