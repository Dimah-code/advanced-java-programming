package Unit_5.Exercises.Exercise_02;

public class Exercise_5_2 {
    public static void main(String[] args) {
        System.out.println("Sqrt(300) = " + Math.sqrt(300));
        double degree = 100;
        double radians = Math.toRadians(degree);
        System.out.println("sin(100) = " + Math.sin(radians) +
                " cos(100) = " + Math.cos(radians));
        System.out.printf("PI with 4 fraction = %.4f\n", Math.PI);
        System.out.println("4 powered by 8 = " + Math.pow(4, 8));
    }
}
