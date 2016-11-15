/**
 * Created by Mariya on 11.10.2016.
 */
public class Sunflower extends Flower {
    public Sunflower(){
        this.stemSize = 40;
        this.color = "yellow";
        this.price = 15;
        this.freshness = true;
    }
    public boolean hasSpikes(){
        return false;
    }
}
