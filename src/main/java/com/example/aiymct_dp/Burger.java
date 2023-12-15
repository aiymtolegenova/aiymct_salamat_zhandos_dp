package com.example.aiymct_dp;

class Burger implements Product {
    Burger() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Burger 1");
        controller.descriptionFirst.setText("Chicken Burger");
        controller.priceFirstProduct.setText("Price : 1490 KZT");
        controller.titleSecondProduct.setText("Burger 2");
        controller.descriptionSecond.setText("Beef Burger");
        controller.priceSecondProduct.setText("Price : 1590 KZT");
        controller.titleThirdProduct.setText("Burger 3");
        controller.descriptionThird.setText("Assorti Burger");
        controller.priceThirdProduct.setText("Price : 1990 KZT");


    }
}
