package mercadopago;

import utils.Token;

public interface IMercadoPago {

    Token authToken();
    void send();
    void receive();
}
