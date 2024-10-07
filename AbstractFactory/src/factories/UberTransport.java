package factories;

import aircrafts.Airplane;
import aircrafts.IAircraft;
import boats.Boat;
import landvehicles.Car;
import boats.IBoat;
import landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {
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
