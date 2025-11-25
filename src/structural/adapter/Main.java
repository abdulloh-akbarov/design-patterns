package structural.adapter;

public class Main {
    public static void main(String[] args) {
        PaypalAdapter paypalAdapter = new PaypalAdapter();

        paypalAdapter.pay(100);
    }
}
