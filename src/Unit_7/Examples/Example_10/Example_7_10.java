package Unit_7.Examples.Example_10;

public class    Example_7_10 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Square sq = new Square(10);
        System.out.printf(">>> Rectangle " + r);
        r.PrintMe();

        System.out.printf(">>> Square " + sq);
        sq.PrintMe();
    }
}
