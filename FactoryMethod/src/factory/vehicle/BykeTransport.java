package factory.vehicle;

import factory.Transport;

public class BykeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Byke();
    }
}
