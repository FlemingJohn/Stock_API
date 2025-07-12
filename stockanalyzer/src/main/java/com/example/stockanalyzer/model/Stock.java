package com.example.stockanalyzer.model;

public class Stock {

    // vairable decalartion
    private String symbol;
    private double currentPrice;
    private double previousPrice;

    // constructors
    public Stock(String symbol, double currentPrice, double previousPrice) {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        this.previousPrice = previousPrice;
    }
    // getters for symbol, currentPrice,previousPrice
    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    // trend- patterns for stock up or down 
    public String getTrend(){
        return currentPrice > previousPrice ? "Upward" : (currentPrice < previousPrice ? "Downward" : "Stable");
    }

     
}
