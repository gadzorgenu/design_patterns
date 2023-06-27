package com.design_patterns.design_pattern.observer_dp;

import java.util.ArrayList;

public class StockGrabber  implements Subject{
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers =  new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        //get the index of the observer to delete
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer "+ (observerIndex) + " deleted");

        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        //Loop through all observers and notifies them of price changes
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    //change prices for all stocks and notifies observers of change
    public void setIBMPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAaplPrice){
        this.aaplPrice = newAaplPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGoogPrice){
        this.googPrice = newGoogPrice;
        notifyObserver();
    }
}
