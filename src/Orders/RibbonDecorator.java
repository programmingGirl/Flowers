package Orders;

/**
 * Created by Mariya on 15.11.2016.
 */
public class RibbonDecorator extends ItemDecorator{
    Item item;
    public double getPrice(){
        return 3 + item.getPrice();
    }

    @Override
    String getDescription() {
        return null;
    }
}
