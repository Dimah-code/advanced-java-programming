package unit_05.Examples.Example_10;

public class stringFormatter {
    public static String leftAdjust(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            return spaces(width - stringLength).insert(0, s).toString();
        }
    }

    public static String rightAdjust(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            return spaces(width - stringLength).insert(0, s).toString();
        }
    }

    public static String center(String s, int width) {
        final int stringLength = s.length();
        if (stringLength >= width) {
            return s;
        } else {
            final int numSpaces = width - stringLength;
            final int leftSpace = numSpaces / 2, rightSpace = numSpaces - leftSpace;
            return spaces(leftSpace).append(s).append(spaces(rightSpace)).toString();
        }
    }

    private static StringBuffer spaces(int numSpaces) {
        if (numSpaces <= 0) {
            return new StringBuffer();
        } else {
            StringBuffer spaces = new StringBuffer();
            for (int i = 0; i < numSpaces; i++) {
                spaces.append(' ');
            }
            return spaces;
        }
    }
}
