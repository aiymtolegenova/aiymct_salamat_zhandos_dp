package com.example.aiymct_dp;

class ChickenFactory implements ProductFactory {
    ChickenFactory() {
    }

    public Product createProduct() {
        return new Chicken();
    }
}
