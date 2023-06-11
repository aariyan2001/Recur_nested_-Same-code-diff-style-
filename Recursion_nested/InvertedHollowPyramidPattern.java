package Recursion_nested;

public class InvertedHollowPyramidPattern {
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
    
    public static String printrows(int rows, int star, int count) {
        // Termination case
        if (rows == 0) {
            return "";
        }
    
        String output;
        // Business Logic + Recursive call
        if (count == 1) {
            // Business logic
            output = printstar(rows + star) + "\n";
            // Recursive call
            output += printrows(rows - 1, star - 1, count + 1);
        } else {
            if (((rows + star) - 2) > 0) {
                // business logic
                output = printspace(count - 1) + "*" + printspace((rows + star) - 2) + "*" + "\n";
                // Recursive call
                output += printrows(rows - 1, star - 1, count + 1);
            } else {
                // Business logic
                output = printspace(count - 1) + "*" + "\n";
                // Recursive call
                output += printrows(rows - 1, star - 1, count + 1);
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
        int rows = 6;
        System.out.print(printrows(rows, rows - 1, 1));
    }

}
