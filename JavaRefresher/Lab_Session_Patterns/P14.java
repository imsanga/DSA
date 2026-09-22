package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Hollow Diamond Pattern

## Problem Description

Given an integer `n`, print a hollow diamond pattern using stars (`*`).

The diamond consists of two parts:
1. The upper half, where the number of stars increases.
2. The lower half, where the number of stars decreases.

Only the boundary of the diamond should contain stars. The interior should be filled with spaces.

---

## Input Format

An integer `n` representing the number of rows in the upper half of the diamond.

---

## Output Format

Print a hollow diamond pattern consisting of `2 * n - 1` rows.

Each row should contain:
- Leading spaces to center-align the diamond.
- Stars only at the beginning and end of the row.
- Spaces between the boundary stars.

---

## Example Input

n = 5

---

## Example Output

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

*/

// Hollow Diamond

public class P14 {
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
                if (k == 1 || k == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

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
                if (k == 1 || k == 2 * (n - i) + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
