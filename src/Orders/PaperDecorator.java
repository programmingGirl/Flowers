package Orders;

/**
 * Created by Mariya on 07.11.2016.
 */
public class PaperDecorator {
    Item item;
    public double getPrice(){
        return 13 + item.price();
    }
    public void getDecription(){

    }
}
