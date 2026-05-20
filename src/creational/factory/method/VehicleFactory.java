package creational.factory.method;

public abstract class VehicleFactory {
    public void createAndValidateVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.validate();
    }

    protected abstract Vehicle createVehicle();
}
