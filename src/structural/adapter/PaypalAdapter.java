package structural.adapter;

public class PaypalAdapter implements PaymentService {
    private final PaypalClient paypalClient = new PaypalClient();

    @Override
    public void pay(double amount) {
        paypalClient.makeCharge(amount);
    }
}
