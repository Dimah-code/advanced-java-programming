package Unit_3.Examples.Example_09;

public class Example_3_9 {
    public static void main(String[] args) {
        for (int i = 41; i <= 120 ; i++) {
            System.out.print(i + " = " + (char)i + "\t");
            if(i % 5 == 0){
                System.out.println();
            }
        }
    }
}
