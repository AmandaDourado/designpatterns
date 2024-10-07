package adapters;

import payoneer.Payoneer;
import paypal.IPayPalPayments;
import utils.Token;

public class PayoneerAdapter implements IPayPalPayments {

    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalpayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payoneer.receivePayment();
    }
}
