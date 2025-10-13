package unit_06.Examples.Example_02;
import java.util.Scanner;

public class Exam {
    static Scanner in = new Scanner(System.in);
    private float[] scores;

    public void getExamData(){
        System.out.println("Enter the number of students: ");
        scores = new float[in.nextInt()];
        for(int i = 0; i < scores.length; i++){
            System.out.print("Score of student " + (i + 1) +": ");
            scores[i] = in.nextFloat();
        }
    }
    public void showStats(){
        if(scores.length > 0){
            System.out.println("************************");
            System.out.println("Students" + "\t" + "Scores");
            for(int i = 0; i < scores.length; i++){
                System.out.println(i+1 + " : \t\t" + scores[i]);
            }
            System.out.println("************************");
            System.out.println("Minimum score is: " + findMin());
            System.out.println("Maximum score is: " + findMax());
            float mean = computeMean();
            System.out.println("Mean score is: " + mean);
            System.out.println("Standard Deviation is: " + computeStandardDev(mean));
        }
        else{
            System.out.println("NO Students No Stats");
        }
    }
    public float findMin(){
            float minScore = scores[0];
        for (int i = 0; i < scores.length; i++)
            if(scores[i] < minScore)
                minScore = scores[i];
        return minScore;
    }
    public float findMax(){
        float maxScore = scores[0];
        for (int i = 0; i < scores.length; i++)
            if(scores[i] > maxScore)
                maxScore = scores[i];
        return maxScore;
    }
    public float computeMean(){
        float avg, sum = 0;
        for(int i = 0; i < scores.length;i++)
            sum += scores[i];
        avg = sum / scores.length;
        return avg;
    }
    public float computeStandardDev(float mean){
        float sumSq = 0;
        for (int i = 0; i < scores.length; i++)
            sumSq += scores[i] * scores[i];
        return (float)(Math.sqrt(sumSq / (float)scores.length - mean * mean));
    }
}
