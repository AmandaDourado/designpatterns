package cars;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmisson;

public class Car {

    private final CarType carType;
    private int seats;
    private final Engine engine;
    private final Transmisson transmisson;
    private final Color color;

    public Car(CarType carType, int seats, Engine engine, Transmisson transmisson, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmisson = transmisson;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmisson getTransmisson() {
        return transmisson;
    }
}
