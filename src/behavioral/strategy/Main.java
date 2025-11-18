package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        CryptoPayment cryptoPayment = new CryptoPayment();
        CardPayment cardPayment = new CardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();

        paymentProcessor.setPaymentStrategy(cryptoPayment);
        paymentProcessor.checkout(100d);

        paymentProcessor.setPaymentStrategy(cardPayment);
        paymentProcessor.checkout(100d);

        paymentProcessor.setPaymentStrategy(payPalPayment);
        paymentProcessor.checkout(100d);
    }
}
