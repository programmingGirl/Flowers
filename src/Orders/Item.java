package Orders;

/**
 * Created by Mariya on 07.11.2016.
 */
public abstract class Item {
    double price;
    String descript;

    abstract String getDescription();

    abstract double getPrice();
}
