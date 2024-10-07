package factories;

import aircrafts.Helicopter;
import aircrafts.IAircraft;
import boats.Boat;
import boats.IBoat;
import landvehicles.ILandVehicle;
import landvehicles.MotorCycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new MotorCycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
