package Basics.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");

            // star
            for (int k = 1; k <= i; k++)
                System.out.print("*");

            System.out.println();
        }

    }
}

// Problem Description

// Print the following pattern in output

// *
// **
// ***
// ****
// *****
// Output Format

// Print the following pattern in 5 lines with 4 spaces and 1 star, 3 spaces and
// 2 stars, 2 spaces and 3 stars, 1 spaces and 4 stars, 0 spaces and 5 stars in
// respectively lines

// *
// **
// ***
// ****
// *****
// Example Output

// *
// **
// ***
// ****
// *****