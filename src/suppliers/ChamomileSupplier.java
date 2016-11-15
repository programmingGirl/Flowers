package suppliers;
import Orders.Item;
import flowers.FlowerSpec;
import flowers.FlowerBucket;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;



public class ChamomileSupplier implements Observer {
    public void update(Observable o, Object arg){
        LinkedList<Item> items = (LinkedList<Item>)arg;
        for (Item it: items){
            FlowerBucket bckt = (FlowerBucket)it;
            FlowerSpec sp = new FlowerSpec();
            System.out.println("Sent request for: " + bckt.search(sp).length + "tulip.");

        }
    }
}
