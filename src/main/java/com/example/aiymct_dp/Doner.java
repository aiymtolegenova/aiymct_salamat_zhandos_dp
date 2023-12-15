package com.example.aiymct_dp;

class Doner implements Product {
    Doner() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Doner1");
        controller.descriptionFirst.setText("Chicken Doner");
        controller.priceFirstProduct.setText("Price : 1490 KZT");
        controller.titleSecondProduct.setText("Doner2");
        controller.descriptionSecond.setText("Beef Doner");
        controller.priceSecondProduct.setText("Price : 1590 KZT");
        controller.titleThirdProduct.setText("Doner3");
        controller.descriptionThird.setText("Assorti Doner");
        controller.priceThirdProduct.setText("Price : 1990 KZT");
    }
}
