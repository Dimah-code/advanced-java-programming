package Unit_5.Examples.Example_06;

public class Example_5_6 {
    public static void main(String[] args) {
        int x, y;
        Integer num1, num2;
        num1 = 8; // Auto box
        num2 = 16; // Auto box
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        x = 2 * num1 + num2; // Auto unboxing
        y = num1 + num2; // Auto unboxing
        System.out.println("x = " + x + ", y = " + y);
    }
}
