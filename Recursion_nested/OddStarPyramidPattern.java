package Recursion_nested;

public class OddStarPyramidPattern {
   private static int rows = 5;

public static String printSpace(int space) {
    // Termination case
    if (space == 0) {
        return "";
    } else {
        // Business logic
        return "  " + printSpace(space - 1);
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
    printLine(row - 1, space + 2);
}

public static int printPattern(int lines) {
    // Termination case
    if (lines == 0) {
        return 0;
    }
    // Recursive call
    int star = printPattern(lines - 1);
    // Business logic
    String spaces = printSpace(rows - (star + 1));
    String stars = printStar(lines + star);
    System.out.println(spaces + stars);
    return star + 1;
}

public static void main(String[] args) {
    printLine(rows, 1);
}

}
