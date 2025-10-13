package Unit_4.Examples.Example_09;
public class Example_4_9 {
    public static void main(String[] args) {
        Change change = new Change();
        int a = 100;
        int b = 200;
        change.setXY(a , b);
        System.out.println("Before switch: ");
        change.show();
        changeMethod(change);
        System.out.println("After switch: ");
        change.show();
    }
    public static void changeMethod(Change change){
        change.switchNumbers();
    }
}
