import builders.CarBuilder;
import builders.TruckBuilder;
import cars.Car;
import cars.Truck;
import director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando carro sedan
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);
        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");
        System.out.println("");

        //criando caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhao: " + truck.getResult());
        System.out.println("");

        // criando carro esportivo
        CarBuilder builderSport = new CarBuilder();
        director.constructSportCar(builderSport);
        Car sportCar = builderSport.getResult();
        System.out.println(sportCar.getCarType() + " produzido com sucesso!");
        System.out.println("");
    }
}