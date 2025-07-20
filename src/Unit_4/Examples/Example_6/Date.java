package Unit_4.Examples.Example_6;

public class Date {
    private int year, month, day;
    Date(){
        this(2012, 2, 5);
    }
    Date(int year, int month, int day){
        setDate(year, month, day);
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void showDate(){
        System.out.printf("%d/%d/%d\n", month, day, year);
    }
}
