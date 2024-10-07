package factory;

import factory.vehicle.BykeTransport;
import factory.vehicle.CarTransport;
import factory.vehicle.MotorcycleTransport;

public class Main {

    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null) {
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type){
            case"Uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BykeTransport();
                break;
            default:
                System.out.println("Selecione o tipo de entrega");
        }
    }
}