package Unit_5.Exercises.Exercise_01.StudentClock;

public class Student {
    private String name;
    private int ID;
    private String enteredTime;
    public Student(){
        setInfo("No name", 0, "00:00:00");
    }
    public Student(String name, int ID, String enteredTime){
        setInfo(name, ID, enteredTime);
    }
    public void setInfo(String name, int ID, String enteredTime){
        this.name = name;
        this.ID = ID;
        this.enteredTime = enteredTime;
    }
    @Override
    public String toString(){
        return "Student ID: " + ID +
                "\nStudent name: " + name +
                "\nStudent entered in " + enteredTime;
    }
}
