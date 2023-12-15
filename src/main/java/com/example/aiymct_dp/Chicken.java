package com.example.aiymct_dp;

class Chicken implements Product {
    Chicken() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Combo 1");
        controller.descriptionFirst.setText("One Chicken Burger, a cola beverage, and a small fries.");
        controller.priceFirstProduct.setText("Price : 2890 KZT");
        controller.titleSecondProduct.setText("Combo 2");
        controller.descriptionSecond.setText("One Chees Burger, a sprite beverage, and a medium fries.");
        controller.priceSecondProduct.setText("Price : 3280 KZT");
        controller.titleThirdProduct.setText("Combo 3");
        controller.descriptionThird.setText("Two BBQ Burger, two pepsi beverage, and a Kiymali pide.");
        controller.priceThirdProduct.setText("Price : 4890 KZT");
    }
}