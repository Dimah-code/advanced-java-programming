package unit_05.Examples.Example_04;

public class Example_5_4 {
    public static void main(String[] args) {
        String str = "I hate Mullahs";
        System.out.println("The person before being sent to intelligence service: " + str);
        intelligenceService(str);
        System.out.println("The person after being sent to the intelligence service: " + str);
    }
    public static void intelligenceService(String str){
        System.out.println("Person in intelligence service: " + str);
        System.out.println("A bit of torture");
        str = "I love Mullahs";
        System.out.println("The person after a little torture in the intelligence service: " + str);
    }
}
