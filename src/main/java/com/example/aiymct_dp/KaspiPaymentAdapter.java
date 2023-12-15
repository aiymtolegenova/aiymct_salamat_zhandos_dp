package com.example.aiymct_dp;

class KaspiPaymentAdapter implements PaymentProcessor {
    private final KaspiBankPaymentSystem kaspiBankPaymentSystem;

    public KaspiPaymentAdapter(KaspiBankPaymentSystem cardPaymentSystem) {
        this.kaspiBankPaymentSystem = cardPaymentSystem;
    }

    public void processPayment(HelloController controller, int amount) {
        this.kaspiBankPaymentSystem.makeKaspiBankPayment(controller, amount);
    }
}
