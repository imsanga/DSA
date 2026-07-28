package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Mirror Pattern

## Problem Description
Take an integer N as input and print the corresponding mirror star pattern.

For example, if N = 5:

**********
****  ****
***    ***
**      **
*        *

Note: The spaces shown above are actual spaces. The underscores (_) in the problem statement are only for illustration.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the pattern in N lines. The number of stars decreases by one on each side in every row, while the spaces between them increase by two.

---

## Example Input

3

---

## Example Output

******
**  **
*    *

*/

import java.lang.*;
import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n - rows - stars - space - stars
        // 5 - 1 - 5 - 0 - 5
        // 5 - 2 - 4 - 2 - 4
        // 5 - 3 - 3 - 4 - 3
        // 5 - 4 - 2 - 6 - 2
        // 5 - 5 - 1 - 8 - 1

        // stars - n-row+1
        // space - row*2-2

        for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // spaces
            for (int k = 1; k <= i * 2 - 2; k++) {
                System.out.print(" ");
            }

            // stars
            for (int l = 1; l <= n - i + 1; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
