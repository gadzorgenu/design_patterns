package com.design_patterns.design_pattern.observer_dp;

public class GrabStocks {
    public static  void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.00);
        stockGrabber.setGOOGPrice(679.00);

        StockObserver observer2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.00);
        stockGrabber.setGOOGPrice(679.00);

//        stockGrabber.unregister(observer2);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 677.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 679.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
