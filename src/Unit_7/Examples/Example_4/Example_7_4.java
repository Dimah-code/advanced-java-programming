package Unit_7.Examples.Example_4;
public class Example_7_4 {
    public static void main(String[] args) {
        Sample sample1 = new Sample(5);
        System.out.println("Sample1: " + sample1);
        Sample sample2 = new Sample(10);
        System.out.println("Sample1: " + sample1);
        System.out.println("Sample2: " + sample2);
        System.out.println("Sum of myValues: " + Sample.getSum());
        System.out.println("Number of sample objects : " + Sample.getCount());
    }
}
