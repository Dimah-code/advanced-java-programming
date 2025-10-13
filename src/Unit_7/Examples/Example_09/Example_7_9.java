package Unit_7.Examples.Example_09;

public class Example_7_9 {
    public static void main(String[] args) {
        intClass number_1 = new intClass(10);
        intClass number_2 = new intClass(15);
        System.out.println("number_1: " + number_1);
        System.out.println("number_2: " + number_2);
        number_1.addToNumber(number_2.getNumber());
        System.out.println(number_1);
    }
}
