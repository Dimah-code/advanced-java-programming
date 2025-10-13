package Unit_7.Exercises.Exercise_05;

public class Order {
    // Fields
    private String customerName, customerPhone;
    protected int price;
    private int order;

    // Constructors
    public Order() {
        this("No Name", "No Phone", 0, 0);
    }

    public Order(String customerName, String customerPhone, int price, int order) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.price = price;
        this.order = order;
        computeFinalPrice();
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public int getPrice() {
        return price;
    }

    public int getOrder() {
        return order;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    // Compute

    public int computeFinalPrice() {
        return (order * price);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Phone number: %s, Price: %d, Order: %d, Final Price: %d",
                customerName, customerPhone, price, order, computeFinalPrice());
    }
}
