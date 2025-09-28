package designpattern.stratergy;

import designpattern.stratergy.payment.Juspay;
import designpattern.stratergy.payment.Paytm;
import designpattern.stratergy.payment.RazorPay;

public class Client {
    public static void main(String[] args) {
        FoodStore foodStore = new FoodStore(new RazorPay());
        foodStore.orderFood(1000);

        foodStore = new FoodStore(new Paytm());
        foodStore.orderFood(2000);

        foodStore = new FoodStore(new Juspay());
        foodStore.orderFood(3000);
    }
}
