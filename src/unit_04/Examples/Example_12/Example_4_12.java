package unit_04.Examples.Example_12;

import java.util.Scanner;

public class Example_4_12 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Clock myClock = new Clock(5, 4, 30);
        Clock yourClock = new Clock();

        int hours, minutes, seconds;
        System.out.println("> My Clock: " + myClock);
        System.out.println("> Your Clock: " + yourClock);

        yourClock.setTime(5, 45, 16);
        System.out.println(">> After setting time for Your Clock: " + yourClock);

        if(myClock.equals(yourClock)){
            System.out.println("Both times are equal!");
        }else{
            System.out.println("The two times are not equal!");
        }
        System.out.println("Enter a Time: ");
        System.out.println("Enter hour: ");
        hours = scanner.nextInt();
        System.out.println("Enter minute: ");
        minutes = scanner.nextInt();
        System.out.println("Enter second: ");
        seconds = scanner.nextInt();
        System.out.println();

        myClock.setTime(hours, minutes, seconds);
        System.out.println(">> New times of my clock: " + myClock);

        myClock.incrementSeconds();

        System.out.println(">>> After incrementing the clock by one second" +
                ", My clock : " + myClock);

        yourClock.makeCopy(myClock);
        System.out.println("After copying my clock into your clock: "
                + yourClock);

    }
}
