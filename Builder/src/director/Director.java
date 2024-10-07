package director;

import builders.IBuilder;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmisson;

public class Director {

    public void constructSedanCar(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.SEDAN);
        iBuilder.setSeats(5);
        iBuilder.setTransmission(Transmisson.AUTOMATIC);
        iBuilder.setEngine(new Engine(1600));
    }

    public void constructSportCar(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.SPORTCAR);
        iBuilder.setSeats(2);
        iBuilder.setEngine(new Engine(4000));
        iBuilder.setColor(new Color("Amarelo"));
    }

    public void constructTruck(IBuilder iBuilder) {
        iBuilder.setCarType(CarType.TRUCK);
        iBuilder.setSeats(5);
        iBuilder.setTransmission(Transmisson.AUTOMATIC_SEQUENTIAL);
        iBuilder.setEngine(new Engine(13000));
    }
}
