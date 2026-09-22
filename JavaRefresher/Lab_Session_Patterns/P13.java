package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Diamond Pattern

## Problem Description

Given an integer `n`, print a diamond pattern made of stars (`*`).

The diamond consists of two parts:
1. The upper half, where the number of stars increases.
2. The lower half, where the number of stars decreases.

Each row should contain appropriate leading spaces to center-align the diamond.

---

## Input Format

An integer `n` representing the number of rows in the upper half of the diamond.

---

## Output Format

Print a diamond pattern consisting of `2 * n - 1` rows.

The number of stars in each row should follow this pattern:
- Upper half: `2 * row - 1`
- Lower half: Decreasing odd numbers

---

## Example Input

n = 5

---

## Example Output

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/

// Diamond Pattern

public class P13 {
    public static void main(String[] args) {
        int n = 5;

        // first half
        for (int i = 1; i <= n; i++) {

            // space = n-row
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars = 2*row-1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // second half
        n = n - 1;
        for (int i = 1; i <= n; i++) {

            // space = row
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // stars = 2*(n-row)+1
            for (int k = 1; k <= 2 * (n - i) + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
