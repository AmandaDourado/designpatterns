import adapters.MercadoPagoAdaptar;
import adapters.PayoneerAdapter;
import mercadopago.MercadoPago;
import payoneer.Payoneer;
import paypal.IPayPalPayments;
import paypal.Paypal;

public class Main {
    public static void main(String[] args) {
        /*
        o código não quebra, independente da forma de pagamento
         */

        
        //IPayPalPayments payment = new Paypal();
        //IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
        IPayPalPayments payment = new MercadoPagoAdaptar(new MercadoPago());
        payment.paypalpayment();
        payment.paypalReceive();

    }
}