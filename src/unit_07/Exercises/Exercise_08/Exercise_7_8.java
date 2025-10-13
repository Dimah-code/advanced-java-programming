package unit_07.Exercises.Exercise_08;

public class Exercise_7_8 {
    public static void main(String[] args) {
        Discount noDiscount = new Discount("Wireless Mouse", "WM123", 50.0);
        RequestedDiscount withRequest = new RequestedDiscount("Wireless Mouse", "WM123", 50.0, 20.0); // 20% off

        System.out.println(noDiscount);
        System.out.println("Final price without discount: $" + noDiscount.calculatePrice());
        System.out.println(withRequest);
        System.out.printf("Final price with %.1f%% discount: $%.2f%n", withRequest.getDiscountPercent(),
                withRequest.calculatePrice());
    }
}
