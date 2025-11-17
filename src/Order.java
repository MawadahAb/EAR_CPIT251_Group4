// Order.java
import java.util.Date;
import java.util.List;

public class Order {

    private int orderID;
    private Date orderDate;
    private String status;
    private double totalPrice;
    private Employee assignedEmployee;
    private Customer customer;
    private List<OrderItem> items;
    private List<Order> deleteOrders;

    private static int[][] PRICES;
    private static List<Order> ordersDB;
    private static int nextOrderID;

    public Order() {

    }

    public int getOrderID() {
        return 0;
    }

    public double getTotalPrice() {
        return 0.0;
    }

    public void addItem(int itemType, int serviceType, int quantity) {

    }

    public void editItem(int itemNumber, int newType, int newService, int newQty) {

    }

    public boolean deleteOrder(int orderID) {
        return false;
    }

    public void updateOrderStatus(String newStatus) {

        //test
    }

    public String trackOrder() {
        return null;
    }



    public void printItems() {
//test
    }

    public static Order findOrderByID(int id) {
        return null;
    }
}
