package behavioral.chainofresponsibility;

public class PaypalHandler extends PaymentHandler {
    @Override
    public String processPayment(Payment payment) {
        if (payment.paymentType.equals("paypal")) return "Paypal is processed";
        else if (nextHandler != null) return nextHandler.processPayment(payment);
        else return "Payment could not be processed";
    }
}
