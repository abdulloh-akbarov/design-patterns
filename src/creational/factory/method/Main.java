package creational.factory.method;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new CarFactory();
        factory.createAndValidateVehicle();
        factory = new MotorcycleFactory();
        factory.createAndValidateVehicle();
    }
}
