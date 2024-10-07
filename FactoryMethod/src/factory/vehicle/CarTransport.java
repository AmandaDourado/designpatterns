package factory.vehicle;


import factory.Transport;

public class CarTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
