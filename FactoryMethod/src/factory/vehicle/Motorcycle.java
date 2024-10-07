package factory.vehicle;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda");
    }
}
