package Recursion_nested;

public class LeftPyramidPattern {
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

public static String printline(int row, int index) {
    // Termination case
    if (row == 0) {
        return "";
    }
    // Business logic
    String lineString = printstar(index) + "\n";
    // Recursive call
    return lineString + printline(row - 1, index + 1);
}

public static void main(String[] args) {
    System.out.println(printline(5, 1));
}

}
