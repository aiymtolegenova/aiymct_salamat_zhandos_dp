package com.example.aiymct_dp;

class NullStrategy implements DiscountStrategy {
    NullStrategy() {
    }

    public double calculatePrice(int sum) {
        return 0.0;
    }
}
