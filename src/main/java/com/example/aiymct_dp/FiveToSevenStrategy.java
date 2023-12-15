package com.example.aiymct_dp;

class FiveToSevenStrategy implements DiscountStrategy {
    FiveToSevenStrategy() {
    }

    public double calculatePrice(int sum) {
        return (double)sum * 0.05;
    }
}
