package Recursion_nested;

public class DiagonalLinePattern {
    
    private static String printspace(int space) {
        // Termination case
        if (space == 0) {
            return "";
        }

        // Business logic
        return "  " + printspace(space - 1);
    }

    public static String printline(int rows) {
        // Termination case
        if (rows == 0) {
            return "";
        }

        // Business logic
        String spaces = printspace(rows - 1);
        String line = "*\n";

        // Recursive call
        String recursiveResult = printline(rows - 1);

        // Business logic
        return spaces + line + recursiveResult + spaces + line;
    }

    public static String printpattern(int rows, int lines) {
        // Termination case
        if (rows == 0) {
            return "";
        }

        // Recursive call
        int space = printpattern(rows - 1, lines).length() / 2;

        // Business logic
        String spaces = printspace(space);
        String line = "*\n";

        return spaces + line;
    }

    public static void main(String[] args) {
        String lineResult = printline(5);
        System.out.print(lineResult);

        printpattern(5, 5);
        
    }
}




