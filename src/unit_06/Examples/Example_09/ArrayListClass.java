package unit_06.Examples.Example_09;

public class ArrayListClass {
    int[] list;
    int numOfElements = 0;

    public ArrayListClass() {
        this(5);
    }

    public ArrayListClass(int num) {
        list = new int[num];
    }

    public int listSize() {
        return list.length;
    }

    public void insertEnd(int element) {
        if (numOfElements < listSize()) {
            list[numOfElements++] = element;
        } else {
            System.out.println("Array is full now!");
        }
    }

    public int elementAt(int element) {
        return list[element];
    }

    @Override
    public String toString() {
        String str = "{";
        for (int i = 0; i < listSize(); i++) {
            str = str + list[i] + ", ";
        }
        str = str + "}";
        return str;
    }

    public int sumArray() {
        int sum = 0;
        for (int i = 0; i < listSize(); i++) {
            sum += list[i];
        }
        return sum;
    }

    public int largestElement() {
        int largest = 0;
        for (int i = 1; i < listSize(); i++) {
            if (list[largest] < list[i]) {
                largest = i;
            }
        }
        return list[largest];
    }

    public void makeCopy(ArrayListClass otherList) {
        numOfElements = otherList.numOfElements;
        for (int i = 0; i < otherList.numOfElements; i++) {
            list[i] = otherList.list[i];
        }
    }

    public void selectionSort() {
        int smallest, minIndex, temp;
        for (int i = 0; i < listSize() - 1; i++) {
            smallest = i;
            for (minIndex = i + 1; minIndex < listSize(); minIndex++) {
                if (list[smallest] > list[minIndex]) {
                    smallest = minIndex;
                }
            }
            temp = list[smallest];
            list[smallest] = list[i];
            list[i] = temp;
        }
    }
}




