package behavioral.chainofresponsibility;

public class CryptoHandler extends PaymentHandler {
    @Override
    public String processPayment(Payment payment) {
        if (payment.paymentType.equals("crypto")) return "Crypto is processed";
        else if (nextHandler != null) return nextHandler.processPayment(payment);
        else return "Payment could not be processed";
    }
}
