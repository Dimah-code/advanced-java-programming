package unit_04.Exercises.Exercise_05;

public class Exercise_4_5 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter 10 courses score: ");
        for(int i = 0; i < 10; i++){
            student.readScore(i);
            student.getSum();
        }
        student.getAvg();
        student.display();
    }
}
