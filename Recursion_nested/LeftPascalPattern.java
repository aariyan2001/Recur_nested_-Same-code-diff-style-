package Recursion_nested;

public class LeftPascalPattern {
    public static String PrintSpace(int space) {
    // Termination case
    if (space == 0) {
        return "";
    }
    // Business logic
    String spaceString = " ";
    // Recursive call
    return spaceString + PrintSpace(space - 1);
    }
    
    public static String PrintStar(int star) {
        // Termination case
        if (star == 0) {
            return "";
        }
        // Business logic
        String starString = "*";
        // Recursive call
        return starString + PrintStar(star - 1);
    }
    
    public static String printcall(int rows, int lines) {
        String output = PrintSpace((int) Math.round(lines / 2.0) - ((lines - rows) + 1)) +
                        PrintStar((lines - rows) + 1) +
                        "\n";
        return output;
    }
    
    public static String printline(int rows, int lines) {
        if (lines % 2 != 0) {  // number of rows is odd
            // Termination case
            if (rows == Math.round(lines / 2.0)) {
                return printcall(rows, lines);
            }
            // Business logic
            String output = printcall(rows, lines);
            // Recursive call
            output += printline(rows - 1, lines);
            // Business logic
            output += printcall(rows, lines);
            return output;
        } else {   // number of rows is even
            // Termination case
            if (rows == lines / 2) {
                return "";
            }
            // Business logic
            String output = printcall(rows, lines);
            // Recursive call
            output += printline(rows - 1, lines);
            // Business logic
            output += printcall(rows, lines);
            return output;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(printline(10, 10));
    }

}
