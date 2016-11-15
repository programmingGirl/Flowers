package Orders;

import flowers.FlowerBucket;

import java.util.LinkedList;


/**
 * Created by Mariya on 07.11.2016.
 */
public class Order {
    protected LinkedList items;
    protected IPayment payment = null;
    protected IDelivery delivery = null;

    public Order(){
        items = new LinkedList<>();
    }

    public IDelivery getDelivery(){
        return delivery;
    }
    public IPayment getPayment(){
        return payment;
    }
    public void setPaymentStrategy(IPayment payment){this.payment = payment;}
    public void setDeliveryStrategy(IDelivery delivery){this.delivery = delivery;}

    public double calculateTotalPrice(){
        double price = 0;
        for (int i = 0; i < items.size(); ++i) {
            price += items.get(i).price();
        }
        return price;
    }

    public void processOrder(){
        if (payment != null){
            payment.pay(calculateTotalPrice());}
            delivery.deliver(items);

    }
    public void addItem(FlowerBucket bouquet){
        items.add(bouquet);
    }
    public void removeItem(FlowerBucket item){
        items.remove(item);
    }
}
