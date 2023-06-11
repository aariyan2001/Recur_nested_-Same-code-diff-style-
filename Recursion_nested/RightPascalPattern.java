package Recursion_nested;

public class RightPascalPattern {
    public static String printstar(int star) {
    if (star == 0) {
        return "";
    }
    return " * " + printstar(star - 1);
    }
    
    public static String printcall(int rows, int lines) {
        return printstar((lines - rows) + 1) + "\n";
    }
    
    public static String printline(int rows, int lines) {
        String result = "";
        if (lines % 2 != 0) { // Number of rows is odd
            if (rows == Math.round(lines / 2.0)) {
                result += printcall(rows, lines);
                return result;
            }
            result += printcall(rows, lines);
            result += printline(rows - 1, lines);
            result += printcall(rows, lines);
        } else { // Number of rows is even
            if (rows == lines / 2) {
                return result;
            }
            result += printcall(rows, lines);
            result += printline(rows - 1, lines);
            result += printcall(rows, lines);
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.print(printline(5, 5));
    }

}
