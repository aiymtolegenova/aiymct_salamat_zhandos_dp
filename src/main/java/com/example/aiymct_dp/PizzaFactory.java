package com.example.aiymct_dp;

class PizzaFactory implements ProductFactory {
    PizzaFactory() {
    }

    public Product createProduct() {
        return new Pizza();
    }
}
