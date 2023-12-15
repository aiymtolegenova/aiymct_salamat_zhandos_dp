package com.example.aiymct_dp;

class PideFactory implements ProductFactory {
    PideFactory() {
    }

    public Product createProduct() {
        return new Pide();
    }
}
