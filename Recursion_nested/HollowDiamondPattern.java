package Recursion_nested;

public class HollowDiamondPattern {
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
    
    public static String printpatterneven(int constrow, int count) {
        if (constrow % 2 == 0) {
            return printstar((constrow - count) / 2) + printspace(count) + printstar((constrow - count) / 2) + "\n";
        } else {
            return printstar((constrow - (count - 1)) / 2) + printspace(count - 1) + printstar((constrow - (count - 1)) / 2) + "\n";
        }
    }
    
    public static String printrows(int rows, int constrow, int count) {
        if (constrow % 2 == 0) { // For even rows
            // Termination case
            if (rows == constrow / 2) {
                return "";
            }
            // Business logic
            String output = printpatterneven(constrow, count);
            // Recursive call
            output += printrows(rows - 1, constrow, count + 2);
            // Business logic
            output += printpatterneven(constrow, count);
            return output;
        } else { // For odd rows
            // Termination case
            if (rows == Math.round(constrow / 2.0)) {
                return printpatterneven(constrow, count);
            } else if (rows == constrow) {
                // Business logic
                String output = printstar(constrow) + "\n";
                // Recursive call
                output += printrows(rows - 1, constrow, count + 2);
                return output;
            } else {
                // Business logic
                String output = printpatterneven(constrow, count);
                // Recursive call
                output += printrows(rows - 1, constrow, count + 2);
                // Business logic
                output += printpatterneven(constrow, count);
                if (count == 2) {
                    output += printstar(constrow) + "\n";
                }
                return output;
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.print(printrows(12, 12, 0));
    }

}
