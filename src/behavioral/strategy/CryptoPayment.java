package behavioral.strategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Crypto payment: " + amount);
    }
}
