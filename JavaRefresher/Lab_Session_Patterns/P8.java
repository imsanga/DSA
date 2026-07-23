package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Full Pyramid

## Problem Description
Take an integer N as input and print the corresponding full pyramid star pattern.

For example, if N = 5:

    *
   * *
  * * *
 * * * *
* * * * *

Note: There should be exactly one extra space after each '*' in every row.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the full pyramid pattern in N lines. Each row contains one more star than the previous row, with leading spaces to keep the pyramid centered.

---

## Example Input

3

---

## Example Output

  *
 * *
* * *

*/

import java.lang.*;
import java.util.*;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // spaces => n-row
        // rows => row

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}