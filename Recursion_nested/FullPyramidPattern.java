package Recursion_nested;


public class FullPyramidPattern {
    private static int rows = 5;

    public static String printSpace(int space) {
        // Termination case + Business logic
        if (space == 0) {
            return "";
        } else {
            return "  " + printSpace(space - 1);
        }
    }

    public static String printStar(int star) {
        // Termination case
        if (star == 0) {
            return "";
        }
        // Business logic
        return "* " + printStar(star - 1);
    }

    public static String printLine(int row, int space) {
        // Termination case
        if (row == 0) {
            return "";
        }
        // Business logic
        String line = printSpace(row - 1) + printStar(space) + "\n";
        // Recursive call
        line += printLine(row - 1, space + 2);

        // Business logic
        if (space == 9) {
            return line;
        }
        line += printSpace(row - 1) + printStar(space) + "\n";
        return line;
    }

    public static void main(String[] args) {
        String output = printLine(rows, 1);
        System.out.println(output);
    }
}


