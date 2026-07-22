package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Right Aligned Triangle

## Problem Description
Take an integer N as input and print the corresponding right aligned triangle pattern.

For example, if N = 5:

    *
   **
  ***
 ****
*****

Note: The leading spaces are required to right align the stars.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the right aligned triangle pattern in N lines, where the i-th line contains (N-i) leading spaces followed by i stars (*).

---

## Example Input

3

---

## Example Output

  *
 **
***

*/

import java.lang.*;
import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n - rows - space - stars
        // 5 - 1 - 4 - 1
        // 5 - 2 - 3 - 2
        // 5 - 3 - 2 - 3
        // 5 - 4 - 1 - 4
        // 5 - 5 - 0 - 5

        // space = n-rows
        // stars = rows

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
