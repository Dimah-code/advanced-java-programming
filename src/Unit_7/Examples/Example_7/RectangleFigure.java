package Unit_7.Examples.Example_7;

public class RectangleFigure {
    private double length, width;
    public RectangleFigure(){
        length = 0;
        width = 0;
    }
    public RectangleFigure(double length, double width){
        setDimension(length, width);
    }
    public void setDimension(double length, double width){
        if(length >= 0){
            this.length = length;
        }else{
            this.length = 0;
        }
        if(width >= 0){
            this.width = width;
        }else{
            this.width = 0;
        }
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double area(){
        return (length * width);
    }
    public double perimeter(){
        return 2 * (length + width);
    }
    public String toString(){
        return ("Length = " + length +
                " Width = " + width +
                " Area = " + area() +
                " Perimeter = " + perimeter());
    }

}
