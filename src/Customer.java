public class Customer extends User {
     String phoneNumber;
     List<Order> history;
     List<Customer> customer;

    public boolean loginWithOTP(String phoneNumber) {
        return false;
    }

    public List<Order> viewPastOrders() {
        return history;
    }
}