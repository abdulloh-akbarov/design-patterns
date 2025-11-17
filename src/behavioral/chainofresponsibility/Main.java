package behavioral.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        PaymentHandler chain = new PaypalHandler().setNextHandler(new CryptoHandler());

        Payment payment = new Payment("humo", 10000d);

        System.out.println(chain.processPayment(payment));
    }
}
