/**
 * Created by Mariya on 11.10.2016.
 */
public class Rose extends Flower {
    public Rose(double stemSize, String color){
        this.stemSize = stemSize;
        this.color = color;
        this.price = 20;
        this.freshness = true;
    }
    public boolean hasSpikes(){
        return true;
    }
}
