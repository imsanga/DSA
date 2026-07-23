package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Inverted Right Triangle Star Pattern

## Problem Description
Take an integer N as input and print the corresponding inverted right triangle star pattern.

For example, if N = 3:

***
 **
  *

Note:
- The leading spaces shown above are actual spaces.
- The underscores (_) in the problem statement are only for illustration.
- You must print spaces in your code, not underscores.
- There should be no spaces between or after the stars.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the inverted right triangle pattern consisting of N rows.

- The first row contains N stars.
- Each subsequent row begins with one additional leading space and contains one fewer star than the previous row.
- No spaces should appear between or after the stars.

---

## Example Input

3

---

## Example Output

***
 **
  *

*/

import java.lang.*;
import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // space => row-1
        // star => n-row+1

        for (int i = 1; i <= n; i++) {

            // space
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // star
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
