package Recursion_nested;

public class StarSquarePattern {
    public static String printstar(int star) {
    if (star == 0) {
        return "";
    }
    return "*" + printstar(star - 1);
    }
    
    public static String printline(int rows, int star) {
        if (rows == 0) {
            return "";
        }
        String output = printstar(star) + "\n";
        output += printline(rows - 1, star);
        return output;
    }
    
    public static void main(String[] args) {
        System.out.print(printline(5, 5));
    }

}
