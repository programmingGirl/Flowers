package Orders;

/**
 * Created by Mariya on 07.11.2016.
 */
public class PaperDecorator extends ItemDecorator {
    Item item;
    public double getPrice(){
        return 13 + item.getPrice();
    }

    @Override
    String getDescription() {
        return null;
    }
}
