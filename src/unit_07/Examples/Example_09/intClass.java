package unit_07.Examples.Example_09;

public class intClass extends PrimitiveTypeClass {
    private int number;

    public intClass() {
        number = 0;
    }

    public intClass(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addToNumber(int number) {
        this.number += number;
    }

    public void multipyByNumber(int number) {
        this.number *= number;
    }

    public int compareTo(PrimitiveTypeClass right) {
        intClass temp = (intClass) right;
        return (number - temp.getNumber());
    }

    public boolean equals(PrimitiveTypeClass right) {
        intClass temp = (intClass) right;
        if (number == temp.getNumber()) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return (String.valueOf(number));
    }
}
