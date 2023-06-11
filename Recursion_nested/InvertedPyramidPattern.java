package Recursion_nested;

public class InvertedPyramidPattern {
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
    
    public static String printrows(int rows, int star) {
        // Termination case
        if (rows == 0) {
            return "";
        }
        // Recursive call
        String output = printrows(rows - 1, star + 2);
        // Business logic
        output += printspace(rows - 1) + printstar(star) + "\n";
        return output;
    }
    
    public static void main(String[] args) {
        int rows = 5;
        System.out.print(printrows(rows, 1));
    }

}
