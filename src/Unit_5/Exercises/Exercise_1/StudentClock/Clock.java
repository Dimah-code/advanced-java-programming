package Unit_5.Exercises.Exercise_1.StudentClock;

public class Clock {
    private int hours, minutes, seconds;

    public Clock(){
        setTime(0, 0, 0);
    }
    public Clock(int hours, int minutes, int seconds){
        setTime(hours, minutes, seconds);
    }
    public void setTime(int hours, int minutes, int seconds){
        if(hours >= 0 && hours < 24){
            this.hours = hours;
        }else{
            this.hours = 0;
        }
        if(minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }else{
            this.minutes = 0;
        }
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        }else{
            this.seconds = 0;
        }
    }

    public String toString(){
        String time = "";
        if(hours < 10){
            time = "0";
        }
        time = time + hours + ":";
        if(minutes < 10){
            time = time + "0";
        }
        time = time + minutes + ":";
        if(seconds < 10){
            time = time + "0";
        }
        time = time + seconds;
        return time;
    }
}