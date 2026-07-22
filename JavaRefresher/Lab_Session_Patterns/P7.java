package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Reverse Mirror Pattern

## Problem Description
Take an integer N as input and print the corresponding reverse mirror star pattern.

For example, if N = 5:

*        *
**      **
***    ***
****  ****
**********

Note: The spaces shown above are actual spaces. The underscores (_) in the problem statement are only for illustration.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the pattern in N lines. The number of stars increases by one on each side in every row, while the spaces between them decrease by two.

---

## Example Input

3

---

## Example Output

*    *
**  **
******

*/

import java.lang.*;
import java.util.*;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // stars => rows
        // space => n*2-rows-rows

        for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int k = 1; k <= n * 2 - i - i; k++) {
                System.out.print(" ");
            }

            // stars
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
