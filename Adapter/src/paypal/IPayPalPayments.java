package paypal;

import utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void paypalpayment();
    void paypalReceive();
}
