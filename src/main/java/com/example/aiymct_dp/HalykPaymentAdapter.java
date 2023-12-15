package com.example.aiymct_dp;

class HalykPaymentAdapter implements PaymentProcessor {
    private final HalykBankPaymentSystem halykBankPaymentSystem;

    public HalykPaymentAdapter(HalykBankPaymentSystem cashPaymentSystem) {
        this.halykBankPaymentSystem = cashPaymentSystem;
    }

    public void processPayment(HelloController controller, int amount) {
        this.halykBankPaymentSystem.makeHalykBankPayment(controller, amount);
    }
}