package Orders;

/**
 * Created by Mariya on 07.11.2016.
 */
public class BasketDecorator extends ItemDecorator{

    @Override
    String getDescription() {
        return null;
    }

    @Override
    double getPrice() {
        return (item.getPrice() +4);
    }
}
