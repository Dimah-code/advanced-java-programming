package Unit_7.Examples.Example_8;

public class Example_7_8 {
    public static void main(String[] args) {
        RectangleShape rectangle, rectRef;
        BoxShape box, boxRef;
        rectangle = new RectangleShape(12, 4);
        System.out.println("Rectangle: " + rectangle);

        box = new BoxShape(13, 7, 4);
        System.out.println("Box: " + box);

        rectRef = box;
        System.out.println("Box in RectRef " + rectRef);

        boxRef = (BoxShape) rectRef;
        System.out.println("Box in BoxRef " + boxRef);
        if (rectRef instanceof BoxShape) {
            System.out.println("RectRef is an instance of boxshape");
        } else {
            System.out.println("Rectref isn't an instance of boxshape");
        }
        if (rectangle instanceof BoxShape) {
            System.out.println("rectangle is an instance of boxshape");
        } else {
            System.out.println("rectangle is not an instance of boxshape");
        }
    }
}
