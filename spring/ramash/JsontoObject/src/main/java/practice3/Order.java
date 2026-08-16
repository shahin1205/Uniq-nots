package practice3;

import java.util.List;

public class Order {
    private int orderId;
    Customer customer;
    List<Item> item;
    private  int totalAmount;

    public Order() {}

    public Order(int orderId, Customer customer, List<Item> item, int totalAmount) {
        this.orderId = orderId;
        this.customer = customer;
        this.item = item;
        this.totalAmount = totalAmount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", item=" + item +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
