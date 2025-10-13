package unit_04.Examples.Example_07;
public class Example_4_7 {
    public static void main(String[] args) {
        staticTest obj1 = new staticTest();
        staticTest obj2 = new staticTest();
        System.out.println("> objects first print: ");
        System.out.println("> object1: " + obj1);
        System.out.println("> object1: " + obj2);
        System.out.println(">> Increment count using the class");
        staticTest.incrementCount();
        System.out.println(">> object1: " + obj1);
        System.out.println(">> object2: " + obj2);
        System.out.println(">>> Increment count using obj1");
        obj1.incrementCount();
        System.out.println(">>> object1: " + obj1);
        System.out.println(">>> object2: " + obj2);
        System.out.println(">>>> Increment count using obj2");
        obj2.incrementCount();
        System.out.println(">>>> object1: " + obj1);
        System.out.println(">>>> object2: " + obj2);
        System.out.println(">>>>> set x to 10 in object1");
        obj1.setX(10);
        System.out.println(">>>>> object1: " + obj1);
        System.out.println(">>>>> object2: " + obj2);
    }
}
