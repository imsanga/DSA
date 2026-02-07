package Basics.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Problem Description

// Print the following pattern in output

// *****
// ****
// ***
// **
// *
// Output Format

// Print the following pattern in 5 lines with 5, 4, 3, 2, 1 stars in each line

// *****
// ****
// ***
// **
// *
// Example Output

// *****
// ****
// ***
// **
// *