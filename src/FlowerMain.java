/**
 * Created by Mariya on 23.10.2016.
 */
import java.util.Arrays;
public class FlowerMain {
    public static void main(String args[]) {
        FlowerBucket bucket = new FlowerBucket();
        FlowerSpec tulip = new FlowerSpec();
        tulip.setType("Tulip");
        tulip.setFresh(true);
        tulip.setPrice(100500);
        tulip.setColor(FlowerColor.RED);
        bucket.addFlower(tulip);
    }
}
