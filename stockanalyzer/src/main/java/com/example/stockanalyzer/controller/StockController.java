package com.example.stockanalyzer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockanalyzer.model.Stock;
import com.example.stockanalyzer.service.StockService;

@RestController
@RequestMapping("api/stocks")
public class StockController {
    
    @Autowired
    private StockService stockservice; 

    @GetMapping("/{symbol}")
    public Stock geStock(@PathVariable String symbol){
        return stockservice.getStockDetails(symbol);
    }
    
}
