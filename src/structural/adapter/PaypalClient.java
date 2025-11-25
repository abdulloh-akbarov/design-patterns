package structural.adapter;

public class PaypalClient {
    public void makeCharge(double amount) {
        System.out.println("Charged: " + amount);
    }
}
