package unit_04.Examples.Example_12;

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
    public void setHours(int hours){
        if(hours >= 0 && hours < 24){
            this.hours = hours;
        }else{
            this.hours = 0;
        }
    }
    public void setMinutes(int minutes){
        if(minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }else {
            this.minutes = 0;
        }
    }
    public void setSeconds(int seconds){
        if(seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }else {
            this.seconds = 0;
        }
    }
    public int getHours(){return hours;}
    public int getMinutes(){return minutes;}
    public int getSeconds(){return seconds;}

    public void incrementSeconds(){
        seconds++;
        if(seconds > 59){
            seconds = 0;
            incrementMinutes();
        }
    }
    public void incrementMinutes(){
        minutes++;
        if(minutes > 59){
            minutes = 0;
            incrementHours();
        }
    }
    public void incrementHours(){
        hours++;
        if(hours > 23){
            hours = 0;
        }
    }
    public boolean equals(Clock clock){
        return hours == clock.hours && minutes == clock.minutes && seconds == clock.seconds;
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
    public void makeCopy(Clock otherClock){
        hours = otherClock.hours;
        minutes = otherClock.minutes;
        seconds = otherClock.seconds;
    }
    public Clock getCopy(){
        Clock temp = new Clock(hours, minutes, seconds);
        return temp;
    }
}
