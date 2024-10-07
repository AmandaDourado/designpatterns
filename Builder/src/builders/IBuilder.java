package builders;

import components.CarType;
import components.Color;
import components.Engine;
import components.Transmisson;

public interface IBuilder {

    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmisson transmisson);
    void setEngine(Engine engine);
    void setColor(Color color);
}
