package Unit_4.Examples.Example_10;
public class Example_4_10 {
    public static void main(String[] args) {
        Change change = new Change();
        int a = 100;
        int b = 200;
        change.setXY(a , b);
        System.out.println("Before Change");
        change.show();
        change = changeMethod(change);
        System.out.println("After change");
        change.show();
    }
    public static Change changeMethod(Change change){
        change.switchNumbers();
        return change;
    }
}
