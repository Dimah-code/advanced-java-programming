package Unit_5.Examples.Example_9;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Example_5_9 {
    public static void main(String[] args) {
        Date now = new Date();

        DateFormat formatter = DateFormat.getDateInstance();
        System.out.println("Default date: " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println("Short (UK): " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Medium: " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long: " + formatter.format(now));

        formatter = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("FULL: " + formatter.format(now));
    }
}
