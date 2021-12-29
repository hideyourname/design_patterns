package com.balabasciuc.design_patterns.BehavioralPatterns.CommandPattern.orderExample;

public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }



}
