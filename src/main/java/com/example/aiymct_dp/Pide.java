package com.example.aiymct_dp;

class Pide implements Product {
    Pide() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Pide 1");
        controller.descriptionFirst.setText("Pide with cheese");
        controller.priceFirstProduct.setText("Price : 990 KZT");
        controller.titleSecondProduct.setText("Pide 2");
        controller.descriptionSecond.setText("Pide with eggs");
        controller.priceSecondProduct.setText("Price : 1090 KZT");
        controller.titleThirdProduct.setText("Pide 3");
        controller.descriptionThird.setText("Pide with sausage");
        controller.priceThirdProduct.setText("Price : 1190 KZT");
    }
}
