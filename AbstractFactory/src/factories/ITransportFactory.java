package factories;

import aircrafts.IAircraft;
import boats.IBoat;
import landvehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
