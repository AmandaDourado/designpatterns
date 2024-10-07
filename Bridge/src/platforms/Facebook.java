package platforms;

public class Facebook implements IPlatform {

    public Facebook() {
        configureRMTP();
        System.out.println("Facebook: iniciando transmissão");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando app");
    }
}
