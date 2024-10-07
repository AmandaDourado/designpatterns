package adapters;

import mercadopago.MercadoPago;
import paypal.IPayPalPayments;
import utils.Token;

public class MercadoPagoAdaptar implements IPayPalPayments {

    private MercadoPago mercadoPago;

    public MercadoPagoAdaptar(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalpayment() {
        mercadoPago.send();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.receive();
    }
}
