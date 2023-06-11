package Recursion_nested;

public class PyramidPattern {
    private static int rows = 5;

    public static String printSpace(int space) {
        // Termination case
        if (space == 0) {
            return "";
        } else {
            // Business logic
            return " " + printSpace(space - 1);
        }
    }
    
    public static String printStar(int star) {
        // Termination case
        if (star == 0) {
            return "";
        } else {
            // Business logic
            return "*" + " " + printStar(star - 1);
        }
    }
    
    public static void printLine(int row, int space) {
        // Termination case
        if (row == 0) {
            return;
        }
        // Business logic
        String spaces = printSpace(row - 1);
        String stars = printStar(space);
        System.out.println(spaces + stars);
        // Recursive call
        printLine(row - 1, space + 1);
    }
    
    public static void main(String[] args) {
        printLine(6, 0);
    }

}
