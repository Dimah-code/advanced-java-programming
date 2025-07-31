package Unit_6.Exercises.Exercise_4;

import java.util.Vector;

public class Exercise_6_4 {
    public static void main(String[] args) {
        Vector<Integer> first = new Vector<Integer>();

        for (int i = 2; i <= 200; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                first.add(i);
            }
        }

        System.out.println(first);
    }
}
