import app.Application;
import boats.BoatTransport;
import factories.ITransportFactory;
import factories.NineNineTransport;
import factories.UberTransport;

public class Main {


    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }

    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "bot";

        if(company == "99"){
            factory = new UberTransport();
        } else if(company == "uber") {
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }

        app = new Application(factory);

        return app;
    }
}