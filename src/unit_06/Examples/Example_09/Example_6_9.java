package unit_06.Examples.Example_09;
import java.util.Scanner;

public class Example_6_9 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayListClass myList = new ArrayListClass(10);
        ArrayListClass yourList = new ArrayListClass(10);
        int num;
        System.out.println("Enter " + myList.listSize() + " integer number: ");
        for(int i = 0; i < myList.listSize(); i++){
            num = in.nextInt();
            myList.insertEnd(num);
        }
        System.out.println("Before Sorting \n " + myList);
        myList.selectionSort();
        System.out.println("After sorting \n " + myList);
        int largestElement = myList.largestElement();
        System.out.println("Largest number in array: " + largestElement);
        yourList.makeCopy(myList);
        System.out.println("your list after copying mylist " + yourList);
    }
}
