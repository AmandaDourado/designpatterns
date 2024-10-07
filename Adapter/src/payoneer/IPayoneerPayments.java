package payoneer;

import utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
