package creational.factory.method;

public class Car implements Vehicle {
    @Override
    public void validate() {
        System.out.println("This is a Car");
    }
}
