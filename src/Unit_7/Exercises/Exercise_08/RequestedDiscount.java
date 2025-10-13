package Unit_7.Exercises.Exercise_08;

public class RequestedDiscount extends Discount {
    private double discountPercent; // e.g., 20 means 20% off

    public RequestedDiscount(String productName, String productNumber, double price, double discountPercent) {
        super(productName, productNumber, price);
        if (discountPercent < 0) discountPercent = 0;
        if (discountPercent > 100) discountPercent = 100;
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public double calculatePrice() {
        return getPrice() * (1.0 - discountPercent / 100.0);
    }

    @Override
    public String toString() {
        return "RequestedDiscount{productName='" + getProductName() + "', productNumber='" + getProductNumber()
                + "', originalPrice=" + getPrice() + ", discountPercent=" + discountPercent + "}";
    }
}

