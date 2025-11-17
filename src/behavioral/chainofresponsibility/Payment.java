package behavioral.chainofresponsibility;

public class Payment {
    String paymentType;

    Double amount;

    public String getString() {
        return paymentType;
    }

    public void setString(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Payment(String paymentType, Double amount) {
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public Payment() {
    }
}
