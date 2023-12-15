package com.example.aiymct_dp;

class KaspiBankPaymentSystem {
    KaspiBankPaymentSystem() {
    }

    void makeKaspiBankPayment(HelloController controller, int amount) {
        controller.kaspi.setVisible(false);
        controller.halyk.setVisible(false);
        controller.paymentMethod.setText("Processing Kaspi card \npayment of: $" + amount);
    }
}
