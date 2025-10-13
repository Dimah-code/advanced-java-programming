package Unit_7.Exercises.Exercise_08;

public class Discount {
    private String productName;
    private String productNumber;
    private double price; // original price

    public Discount(String productName, String productNumber, double price) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Returns final price without any discount.
     */
    public double calculatePrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Discount{productName='" + productName + "', productNumber='" + productNumber
                + "', price=" + price + "}";
    }
}
