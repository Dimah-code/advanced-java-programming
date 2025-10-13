package unit_05.Examples.Example_03;

public class Example_5_3 {
    public static void main(String[] args) {
        String str = "Palestine hits Israel, Israel hits Palestine, Palestine destroyed", subStr = "hits";
        int count;
        count = spaceCounter(str);
        System.out.println(count);
        count = substrCounter(str, subStr);
        System.out.println(count);
    }
    public static int spaceCounter(String str){
        int count = 0;
         int index = str.indexOf(" ");
        System.out.println("Place of spaces: ");
         while(index >= 0){
           count++;
           index = str.indexOf(' ', index + 1);
           System.out.println("found in " + index);
        }
        return count;
    }
    public static int substrCounter(String str, String subStr){
        int count = 0;
        int index = str.indexOf(subStr);
        System.out.println("Places of " + subStr + ": ");
        while(index >= 0){
            count++;
            index = str.indexOf(subStr, index + 1);
            System.out.println("found in " + index);
        }
        return count;
    }
}
