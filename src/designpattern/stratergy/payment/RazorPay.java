package designpattern.stratergy.payment;

public class RazorPay implements PaymentService{
    @Override
    public void pay(int amount) {
        System.out.println("Payment of " + amount + " made using RazorPay.");
    }
}
