package Unit_4.Examples.Example_7;
import java.io.*;
public class staticTest {
    private int x;
    private static int count;
    public staticTest(){
        x = 0;
    }
    public staticTest(int a){
        x = a;
    }
    void setX(int number){
        x = number;
    }
    public int getX(){
        return x;
    }
    public int getcount(){
        return count;
    }
    public static void incrementCount(){
        count++;
    }
    @Override
    public String toString(){
        return ("x = " + x + " and count = " + count);
    }
}
