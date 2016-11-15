/**
 * Created by Mariya on 31.10.2016.
 */
public class Tuple <K, V extends Comparable<V>> implements Comparable<Tuple<K, V>> {
    private K x;
    private V y;

    Tuple(K x, V y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x.toString() + "," + y.toString() + ")";
    }

    @Override
    public int compareTo(Tuple<K, V> o){
        return this.y.compareTo(o.y);
    }

}
