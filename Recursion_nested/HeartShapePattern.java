package Recursion_nested;

public class HeartShapePattern {
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

    public static String printuppar(int star, int index, int rowstar) {
        // Termination case
        if (index < 0) {
            return "";
        }
        // Business logic
        String output = printspace(index) + printstar(star) + printspace(rowstar - ((star * 2) + index) - 2) + printstar(star) + "\n";
        // Recursive call
        return output + printuppar(star + 2, index - 1, rowstar);
    }

    public static String printlower(int rows, int star) {
        // Termination case
        if (rows == 0) {
            return printuppar(5, 2, star);
        }

        // Recursive call
        String output = printlower(rows - 1, star + 2);
        // Business logic
        output += printspace(rows - 1) + printstar(star) + "\n";

        return output;
    }

    public static void main(String[] args) {
        System.out.print(printlower(10, 1));
    }

}
