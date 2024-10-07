package boats;

public class Boat implements IBoat {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Sua encomenda está cruzando o atlântico");
    }

    @Override
    public void getCargo() {
        System.out.println("encomenda ok");
    }
}
