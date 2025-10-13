package unit_05.Examples.Example_05;

public class Example_5_5 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("I hate Mullahs");
        System.out.println("The person before being sent to intelligence service: " + str);
        intelligenceService(str);
        System.out.println("The person after being sent to the intelligence service: " + str);
    }

    public static void intelligenceService(StringBuffer str) {
        System.out.println("Person in intelligence service: " + str);
        System.out.println("A bit of torture");
        str.append(", But now I love them");
        System.out.println("The person after a little torture in the intelligence service: " + str);
    }
}
