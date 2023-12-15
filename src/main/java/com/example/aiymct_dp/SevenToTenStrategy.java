package com.example.aiymct_dp;

class SevenToTenStrategy implements DiscountStrategy {
    SevenToTenStrategy() {
    }

    public double calculatePrice(int sum) {
        return (double)sum * 0.1;
    }
}
