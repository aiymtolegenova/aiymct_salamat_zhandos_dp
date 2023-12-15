package com.example.aiymct_dp;

class Pizza implements Product {
    Pizza() {
    }

    public void createProduct(HelloController controller) {
        controller.titleFirstProduct.setText("Pizza1");
        controller.descriptionFirst.setText("Margarita");
        controller.priceFirstProduct.setText("Price : 1890 KZT");
        controller.titleSecondProduct.setText("Pizza2");
        controller.descriptionSecond.setText("Pepperoni");
        controller.priceSecondProduct.setText("Price : 2090 KZT");
        controller.titleThirdProduct.setText("Pizza3");
        controller.descriptionThird.setText("Chetyre Sezona");
        controller.priceThirdProduct.setText("Price : 2290 KZT");
    }
}