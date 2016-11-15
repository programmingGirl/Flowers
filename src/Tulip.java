import flowers.Flower;

/**
 * Created by Mariya on 11.10.2016.
 */
public class Tulip extends Flower {
    public Tulip(double stemSize, String color){
        this.stemSize = stemSize;
        this.color = color;
        this.price = 35;
        this.freshness = true;
    }
    public boolean hasSpikes(){
        return false;
    }
}
