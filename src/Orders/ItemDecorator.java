package Orders;

/**
 * Created by Mariya on 07.11.2016.
 */
abstract public class ItemDecorator extends Item{
    Item item;

    abstract String getDescription();
}
