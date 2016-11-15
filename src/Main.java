import java.util.Arrays;

/**
 * Created by Mariya on 31.10.2016.
 */
public class Main {
    public static void main(String[] args){
        Tuple<Customer, FlowerBucket>[] tpls = new Tuple[3];
        tpls[0] = new Tuple<Customer, FlowerBucket>(3333, 33);
        tpls[1] = new Tuple<Customer, FlowerBucket>(3, 4);
        tpls[2] = new Tuple<Customer, FlowerBucket>(8, 9);
        System.out.println(Arrays.toString(tpls));
        Arrays.sort(tpls);
        System.out.println(Arrays.toString(tpls));
    }
}
