package paypal;

import utils.Token;

public class Paypal implements IPayPalPayments {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalpayment() {
        System.out.println("Enviando pagamentos com o PayPal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via PayPal");
    }
}
