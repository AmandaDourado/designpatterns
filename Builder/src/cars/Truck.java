package cars;

import components.CarType;
import components.Engine;
import components.Transmisson;

public class Truck {

    private final CarType carType;
    private int seats;
    private final Engine engine;
    private final Transmisson transmisson;

    public Truck(CarType carType, int seats, Engine engine, Transmisson transmisson) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmisson = transmisson;
    }

    public String getResult() {
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        return truck;
    }

}
