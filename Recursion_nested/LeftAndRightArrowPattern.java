package Recursion_nested;

public class LeftAndRightArrowPattern {
    public static String printstar(int star) {
    // Termination case
    if (star == 0) {
        return "";
    }
    // Business logic
    String starString = "*";
    // Recursive call
    return starString + printstar(star - 1);
    }
    
    public static String printspace(int space) {
        // Termination case
        if (space == 0) {
            return "";
        }
        // Business logic
        String spaceString = " ";
        // Recursive call
        return spaceString + printspace(space - 1);
    }
    
    public static String printleftarrow(int rows) {
        // Termination case
        if (rows == 2) {
            return printstar(rows - 1);
        }
        // Business logic
        String output = printspace((rows / 2) - 1) + printstar(rows / 2) + "\n";
        // Recursive call
        output += printleftarrow(rows - 2) + "\n";
        // Business logic
        output += printspace((rows / 2) - 1) + printstar(rows / 2);
        return output;
    }
    
    public static String printrightarrow(int rows, int count) {
        // Termination case
        if (rows == 2) {
            return printspace(count) + printstar(rows - 1);
        }
        // Business logic
        String output = printspace(count) + printstar(rows / 2) + "\n";
        // Recursive call
        output += printrightarrow(rows - 2, count + 2) + "\n";
        // Business logic
        output += printspace(count) + printstar(rows / 2);
        return output;
    }
    
    public static void main(String[] args) {
        System.out.println("Left Arrow\n");
        System.out.println(printleftarrow(10));
        System.out.println("\nRight Arrow\n");
        System.out.println(printrightarrow(10, 0));
    }

}
