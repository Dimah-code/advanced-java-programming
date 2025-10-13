package unit_07.Exercises.Exercise_05;

public class Exercise_7_5 {
    public static void main(String[] args) {
        Order order = new Order("Mohammad", "09129121212", 50000, 10);
        WithTransfer owt = new WithTransfer("Zahra", "09363663636", 1000, 5);
        System.out.println("Order withour transfer: ");
        System.out.println(order);
        System.out.println("Another order with transfer: ");
        System.out.println(owt);
    }
}
