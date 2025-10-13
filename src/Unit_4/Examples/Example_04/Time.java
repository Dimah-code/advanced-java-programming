package Unit_4.Examples.Example_04;
public class Time {
    private int hours , minutes , seconds;
    Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public void showTime(){
        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
    }
}
