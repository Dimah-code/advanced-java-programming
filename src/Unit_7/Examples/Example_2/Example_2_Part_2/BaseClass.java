package Unit_7.Examples.Example_2.Example_2_Part_2;
public class BaseClass {
    private String firstName, lastName;
    public static void sayHello(){
        System.out.println("Hello");
    }
    public BaseClass(){
        setName("Emptyfirst", "Emptylast");
    }
    public BaseClass(String firstName, String lastName){
        setName(firstName, lastName);
    }
    private void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return  ("Firstname: " + firstName + " Lastname: " + lastName);
    }
}
