package Unit_7.Exercises.Exercise_7;

public class Exercise_7_7 {
    public static void main(String[] args) {
        CollegeCourse regular = new CollegeCourse("CS101", 1500.0);
        LabCourse lab = new LabCourse("CS102L", 1500.0, 300.0);

        System.out.println(regular);
        System.out.println("Total cost (regular): " + regular.calculateTotalCost());
        System.out.println(lab);
        System.out.println("Total cost (with lab): " + lab.calculateTotalCost());

    }
}
