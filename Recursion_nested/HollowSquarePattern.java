package Recursion_nested;

public class HollowSquarePattern {
    public static String printstar(int star, int row, int label) {
    if (row == 1 || row == label) {
        // Termination case
        if (star == 0) {
            return "";
        }
        // Business logic
        String starString = "*";
        // Recursive call
        return starString + printstar(star - 1, row, label);
    } else {
        // Termination case
        if (star == 0) {
            return "";
        }
        // Business logic
        String output;
        if (star == label || star == 1) {
            output = "*";
        } else {
            output = " ";
        }
        // Recursive call
        return output + printstar(star - 1, row, label);
    }
    }
    
    public static String printline(int row, int star) {
        // Termination case
        if (row == 0) {
            return "";
        }
        // Business logic
        String output = printstar(star, row, star) + "\n";
        // Recursive call
        return output + printline(row - 1, star);
    }
    
    public static void main(String[] args) {
        System.out.print(printline(6, 6));
    }

}
