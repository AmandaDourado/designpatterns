package factory.vehicle;

import factory.Transport;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
