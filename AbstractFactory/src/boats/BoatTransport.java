package boats;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import factories.ITransportFactory;
import landvehicles.Car;
import landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
