package platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: iniciando transmissão");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: configurando RMTP");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o Canal");
    }
}
