package com.example.aiymct_dp;

class Drink implements Product {
    Drink() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Coca Cola");
        controller.descriptionFirst.setText("Coca Cola, 0.5l");
        controller.priceFirstProduct.setText("Price : 490 KZT");
        controller.titleSecondProduct.setText("Fanta");
        controller.descriptionSecond.setText("Fanta, 0.5l");
        controller.priceSecondProduct.setText("Price : 490 KZT");
        controller.titleThirdProduct.setText("Sprite");
        controller.descriptionThird.setText("Sprite, 0.5l");
        controller.priceThirdProduct.setText("Price : 490 KZT");
    }
}

