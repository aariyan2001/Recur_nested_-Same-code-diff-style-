package Recursion_nested;

public class InvertedLeftPyramidPattern {
    public static void printstar(int star) {
    // Termination case
    if (star == 0) {
        return;
    }
    // Business logic
    System.out.print("*");
    // Recursive call
    printstar(star - 1);
}
    
    public static void printline(int row, int index) {
        // Termination case
        if (row == 0) {
            return;
        }
        // Business logic
        printstar(index);
        System.out.println();
        // Recursive call
        printline(row - 1, index - 1);
    }
    
    public static int printline(int row, int index, int classVar) {
        // Termination case
        if (row == 0) {
            return classVar;
        }
        // Recursive call
        int result = printline(row - 1, index, classVar);
        // Business logic
        printstar(result);
        System.out.println();
        return result - 1;
    }
    
    public static void main(String[] args) {
        int classVar = 5;
        printline(classVar, classVar);
    }

}
