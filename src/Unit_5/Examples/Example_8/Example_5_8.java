package Unit_5.Examples.Example_8;
import java.text.*;
public class Example_5_8 {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(5);
        System.out.println("Truncated PI = " + formatter.format(Math.PI));
        formatter.setMinimumIntegerDigits(4);
        System.out.println("Truncated PI = " + formatter.format(Math.PI));
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Money symbol usage: " + money.format((3.53)));
        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println("Percent symbol usage: "+ percent.format(0.353));
    }
}
