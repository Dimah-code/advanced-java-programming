package unit_04.Examples.Example_05;

public class Date {
    private int year, month, day;
    Date(){
        setDate(2012, 2, 5);
    }
    Date(int year , int month , int day){
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
