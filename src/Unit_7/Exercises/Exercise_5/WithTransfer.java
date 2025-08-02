package Unit_7.Exercises.Exercise_5;

public class WithTransfer extends Order {
    private final int transferCost = 4000;

    // Constructors
    public WithTransfer(String name, String phone, int price, int order) {
        super(name, phone, price, order);
        computeFinalPrice();
    }

    public int computeFinalPrice() {
        return (super.computeFinalPrice() + transferCost);
    }

    // toString
    @Override
    public String toString() {
        return String.format("Name: %s, Phone number: %s, Price: %d, Order: %d, Final Price: %d",
                super.getCustomerName(), super.getCustomerPhone(), super.getPrice(), super.getOrder(), computeFinalPrice());
    }
}
