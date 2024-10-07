package mercadopago;

import utils.Token;

public class MercadoPago implements IMercadoPago {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void send() {
        System.out.println("Enviando pagamento via MercadoPago");
    }

    @Override
    public void receive() {
        System.out.println("Enviando pagamento via MercadoPago");
    }
}
