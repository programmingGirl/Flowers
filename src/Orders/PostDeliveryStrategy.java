package Orders;

import java.util.LinkedList;

/**
 * Created by Mariya on 07.11.2016.
 */
public class PostDeliveryStrategy implements IDelivery {
    @Override
    public void deliver(LinkedList items) {

        System.out.println("We will deliver your order by a post.");
    }
}
