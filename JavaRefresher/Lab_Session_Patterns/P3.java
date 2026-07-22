package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Number Pattern - Stair Pattern

## Problem Description
Take an integer N as input and print the corresponding number pattern.

For example, if N = 4:

1
1 2
1 2 3
1 2 3 4

Note: There should be no extra spaces after the last integer in any row.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the pattern in N lines, where the i-th line contains numbers from 1 to i separated by a single space.

---

## Example Input

2

---

## Example Output

1
1 2

*/

import java.lang.*;
import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n - rows - stars
        // 4 - 1 - 4
        // 4 - 2 - 3
        // 4 - 3 - 2
        // 4 - 4 - 1

        // stars -> n-row+1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
