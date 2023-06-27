package com.design_patterns.design_pattern.observer_dp;

//Represents each observer that is monitoring changes in the subject
public class StockObserver implements Observer{
    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    private static int ObserverIDTracker = 0; //used as counter
    private int observerID;
    
    private Subject stockGrabber; //holds reference to the stockGrabber
    
    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++ObserverIDTracker;
        System.out.println("New obsever "+ this.observerID);

        stockGrabber.register(this);
    }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.googPrice = googlePrice;
        this.aaplPrice = aaplPrice;

        printThePrices();
    }

    public void printThePrices(){
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice +
                "\nGOOG: " + googPrice);
    }
}
