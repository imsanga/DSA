package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Hollow Square Star Pattern

## Problem Description
Take an integer N as input and print the corresponding hollow square star pattern.

For example, if N = 5:

*****
*   *
*   *
*   *
*****

Note:
- The first and last rows contain N stars.
- Every middle row contains a star at the beginning and end, with (N − 2) spaces in between.
- The spaces shown above are actual spaces.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the hollow square pattern consisting of N rows.

- The first and last rows contain only stars.
- Each middle row contains one star, followed by (N − 2) spaces, followed by one star.

---

## Example Input

4

---

## Example Output

****
*  *
*  *
****

*/

import java.lang.*;
import java.util.*;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int k = 1; k <= n - 2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
