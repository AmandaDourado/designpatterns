package builders;

import cars.Car;
import components.CarType;
import components.Color;
import components.Engine;
import components.Transmisson;

public class CarBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Transmisson transmisson;
    private Engine engine;
    private Color color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmisson transmisson) {
        this.transmisson = transmisson;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult() {
        return new Car(carType,seats,engine,transmisson,color);
    }
}
