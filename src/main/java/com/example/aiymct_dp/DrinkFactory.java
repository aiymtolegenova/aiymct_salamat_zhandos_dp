package com.example.aiymct_dp;

class DrinkFactory implements ProductFactory {
    DrinkFactory() {
    }

    public Product createProduct() {
        return new Drink();
    }
}