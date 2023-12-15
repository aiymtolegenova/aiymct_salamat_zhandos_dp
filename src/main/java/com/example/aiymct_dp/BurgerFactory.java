package com.example.aiymct_dp;

class BurgerFactory implements ProductFactory {
    BurgerFactory() {
    }

    public Product createProduct() {
        return new Burger();
    }
}
