package com.example.stockanalyzer.service;
import org.springframework.stereotype.Service;
import com.example.stockanalyzer.model.Stock;

@Service
public class StockService {
    
    public Stock getStockDetails(String symbol){

        // Actual API Logic for static 
        double previousPrice = Math.random() * 1000;
        double currentPrice = previousPrice + (Math.random() *20 -10);

        return new Stock(symbol.toUpperCase(),currentPrice,previousPrice);

    }
}
