package behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Paypal payment: " + amount);
    }
}
