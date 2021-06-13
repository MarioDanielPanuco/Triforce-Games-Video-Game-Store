import java.util.Comparator;

public class Order {

    private Customer customer;
    private int shippingSpeed, priority; //TODO: ask her about how we calculate priority
    private long date;
    private List<VideoGame> orderContents;
    private boolean shippingStatus;

    public Order(Customer customer, long date, List<VideoGame> orderContents, int shippingSpeed, boolean shippingStatus) {
        this.customer = customer;
        this.date = date;
        this.orderContents = orderContents;
        this.shippingSpeed = shippingSpeed;
        this.priority = (int) (date / shippingSpeed);
        this.shippingStatus = shippingStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public List<VideoGame> getOrderContents() {
        return orderContents;
    }

    public void setOrderContents(List<VideoGame> orderContents) {
        this.orderContents = orderContents;
    }

    public int getShippingSpeed() {
        return shippingSpeed;
    }

    public void setShippingSpeed(int shippingSpeed) {
        this.shippingSpeed = shippingSpeed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(boolean shippingStatus) {
        this.shippingStatus = shippingStatus;
    }
    
    @Override public String toString() {
		return ;
    	
    }


}

class OrderComparator implements Comparator<Order> {
    public int compare(Order order1, Order order2) {
        return order1.getPriority() - order2.getPriority();
    }
}
//Should also contain a Comparator class with a compare method to determine priority