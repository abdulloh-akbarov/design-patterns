package creational.factory.method;

public class MotorcycleFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Motorcycle();
    }
}
