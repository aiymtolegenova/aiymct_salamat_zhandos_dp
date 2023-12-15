package com.example.aiymct_dp;

class HalykBankPaymentSystem {
    HalykBankPaymentSystem() {
    }

    void makeHalykBankPayment(HelloController controller, int amount) {
        controller.kaspi.setVisible(false);
        controller.halyk.setVisible(false);
        controller.paymentMethod.setText("Processing Halyk card \npayment of: $" + amount);
    }
}