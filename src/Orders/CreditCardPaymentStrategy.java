package Orders;
import java.util.Scanner;
/**
 * Created by Mariya on 07.11.2016.
 */
public class CreditCardPaymentStrategy implements IPayment {

    @Override
    public double pay(double price) {
        System.out.println("Enter credit card number:");
        //String s = sc.nextLine();
        return 0;
    }
}
