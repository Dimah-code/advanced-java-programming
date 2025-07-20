package Unit_4.Examples.Example_10;
public class Change {
    private int x, y;
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println("x = " + x + " y = " + y);
    }
    public void switchNumbers(){
        int temp = x;
        x = y;
        y = temp;
    }
}
