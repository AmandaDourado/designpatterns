package app;

import aircrafts.IAircraft;
import factories.ITransportFactory;
import boats.IBoat;
import landvehicles.ILandVehicle;


public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
