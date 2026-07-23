package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Half Diamond Star Pattern

## Problem Description
Take an integer N as input and print the corresponding Half Diamond star pattern consisting of (2 × N − 1) rows.

For example, if N = 5:

*
**
***
****
*****
****
***
**
*

Note:
- There should be no spaces after any `*`.
- The pattern first increases from 1 star to N stars, then decreases back to 1 star.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the Half Diamond pattern consisting of (2 × N − 1) rows.

- The first N rows contain an increasing number of stars.
- The remaining N − 1 rows contain a decreasing number of stars.
- No spaces should appear after any `*`.

---

## Example Input

3

---

## Example Output

*
**
***
**
*

*/

import java.lang.*;
import java.util.*;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n * 2 - 1; i++) {

            if (i > n) {
                for (int k = 1; k <= 2 * n - i; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
