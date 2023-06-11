package Recursion_nested;

public class MirrorInvertedLeftPyramidPattern {
    public static String printspace(int space) {
    // Termination case
    if (space == 0) {
        return "";
    } else {
        // Business logic
        String spaceString = " ";
        // Recursive call
        return spaceString + printspace(space - 1);
    }
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
    
    public static String printline(int row, int space) {
        // Termination case
        if (row == 0) {
            return "";
        }
        // Business logic
        String lineString = printspace(space) + printstar(row) + "\n";
        // Recursive call
        return lineString + printline(row - 1, space + 1);
    }
    
    public static void main(String[] args) {
        System.out.println(printline(5, 0));
    }

}
