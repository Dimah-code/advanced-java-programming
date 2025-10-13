package Unit_5.Examples.Example_01;
public class Example_5_1 {
    public static void main(String[] args) {
        double radians = 45.0;
        double d1 = 5.0, d2 = 6.5;
        int num, x = 10, y = 20;
        double degree = 90;
        double p = -5.36;
        System.out.println("cos("+radians+")= " + Math.cos(radians));
        System.out.println("pow("+d1+","+d2+")= " + Math.pow(d1,d2));
        for(int i = 0; i < 5; i++){
            num = (int)(5 * Math.random());
            System.out.print("num["+i+"]= " + num+ "\t");
        }
    }
}
