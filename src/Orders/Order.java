package Orders;

import suppliers.ChamomileSupplier;
import suppliers.TulipSupplier;

import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mariya on 07.11.2016.
 */
public class Order extends Observable {
    LinkedList<Observer> observers = new LinkedList<Observer>();

    public Order(){
        observers.add(new ChamomileSupplier());
        observers.add(new TulipSupplier());
    }
    protected LinkedList items;
    protected IPayment payment = null;
    protected IDelivery delivery = null;


    public void setPaymentStrategy(IPayment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(IDelivery delivery){
        this.delivery = delivery;
    }

    public void calculateTotalPrice(){

    }
    public void processOrder(){
        if (payment != null){
            payment.pay(5);
            for (Observer obs: observers){
                obs.update(this, items);
            }
        }

    }
    // public void addItem(Item){items.add(itm);}
    // public void removeItem(Item){}
}
