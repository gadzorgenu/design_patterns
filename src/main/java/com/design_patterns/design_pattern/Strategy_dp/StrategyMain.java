package com.design_patterns.design_pattern.Strategy_dp;

public class StrategyMain {

        public static void main(String[] args) {
            Animal dog = new Dog();
            Animal bird = new Bird();

            System.out.println("Bog: " + dog.tryToFly());
            System.out.println("Bird: " + bird.tryToFly());

        }
}
