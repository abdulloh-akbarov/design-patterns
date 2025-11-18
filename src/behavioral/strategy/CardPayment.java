package behavioral.strategy;

public class CardPayment implements PaymentStrategy{
    @Override
    public void pay(Double amount) {
        System.out.println("Card payment: " + amount);
    }
}
