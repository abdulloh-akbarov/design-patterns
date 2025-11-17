package behavioral.chainofresponsibility;

abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public PaymentHandler setNextHandler(PaymentHandler handler) {
        this.nextHandler = handler;
        return handler;
    }

    public abstract String processPayment(Payment payment);
}
