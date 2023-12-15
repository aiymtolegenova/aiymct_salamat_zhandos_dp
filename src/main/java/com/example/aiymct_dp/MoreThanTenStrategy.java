package com.example.aiymct_dp;
class MoreThanTenStrategy implements DiscountStrategy {
    MoreThanTenStrategy() {
    }

    public double calculatePrice(int sum) {
        return (double)sum * 0.15;
    }
}
