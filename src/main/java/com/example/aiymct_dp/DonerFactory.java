package com.example.aiymct_dp;

class DonerFactory implements ProductFactory {
    DonerFactory() {
    }

    public Product createProduct() {
        return new Doner();
    }
}