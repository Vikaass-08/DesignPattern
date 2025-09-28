package designpattern.stratergy;

import designpattern.stratergy.payment.PaymentService;

public class FoodStore {
    private final PaymentService paymentService;

    public FoodStore(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void orderFood(int amount) {
        System.out.println("Ordering food worth: " + amount);
        paymentService.pay(amount);
    }
}
