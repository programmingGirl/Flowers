package Orders;
import java.util.Scanner;
/**
 * Created by Mariya on 07.11.2016.
 */
public class CreditCardPaymentStrategy implements IPayment {

    @Override
    public void pay(double price) {
        System.out.println("Your order is payed by a credit card.");

    }
}
