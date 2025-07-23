package Unit_5.Exercises.Exercise_5;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise_5_5 {
    public static void main(String[] args) {
        Date now = new Date();
        DateFormat formatter = DateFormat.getDateInstance();
        System.out.println(formatter.format(now));
    }
}
