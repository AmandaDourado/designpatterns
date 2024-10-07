package platforms;

public class DisneyPlus implements IPlatform {

    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: iniciando transmissão");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: autorizado");
    }
}
