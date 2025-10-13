package Unit_4.Exercises.Exercise_05;
import java.util.*;
public class Student {
    static Scanner in  = new Scanner(System.in);
    private double score;
    private double average;
    private double sum;
    private int counter;
    public void readScore(int index){
        System.out.printf("Enter Grade Course %d: ", (index + 1));
        score = in.nextDouble();
        counter++;
    }
    public void getSum(){
        sum += score;
    }
    public void getAvg(){
        average = sum / counter;
    }
    public void display(){
        System.out.printf("Sum of scores: %.2f\n" , sum);
        System.out.printf("Student's Average: %.2f", average);
    }
}
