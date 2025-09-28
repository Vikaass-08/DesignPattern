package designpattern.stratergy.payment;

public class Paytm implements PaymentService{
    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using Paytm.");
    }
}
