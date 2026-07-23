package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Full Numeric Pyramid Pattern

## Problem Description
Given an integer N as input, print the corresponding Full Numeric Pyramid pattern.

For example, if N = 5:

0 0 0 0 1 0 0 0 0 
0 0 0 2 3 2 0 0 0 
0 0 3 4 5 4 3 0 0 
0 4 5 6 7 6 5 4 0 
5 6 7 8 9 8 7 6 5 

Note:
- There should be exactly one extra space after each number.
- There is no extra space before the first number of any row.
- There is an extra space after the last number of every row.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the Full Numeric Pyramid pattern consisting of N rows.

Each row contains (2 × N − 1) numbers:
- Leading and trailing positions are filled with 0.
- The middle forms a numeric pyramid where numbers increase toward the center and then decrease symmetrically.
- Numbers are separated by a single space, with one extra space after the last number.

---

## Example Input

3

---

## Example Output

0 0 1 0 0 
0 2 3 2 0 
3 4 5 4 3

*/

import java.lang.*;
import java.util.*;

public class P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // zeros => n-row
        // data => 2*row-1

        for (int i = 1; i <= n; i++) {

            // zeros
            for (int j = 1; j <= n - i; j++) {
                System.out.print("0 ");
            }

            // data
            int temp = i;
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k > i)
                    System.out.print(--temp + " ");
                else if (k == i)
                    System.out.print(temp + " ");
                else
                    System.out.print(temp++ + " ");
            }

            // zeros
            for (int l = 1; l <= n - i; l++) {
                System.out.print("0 ");
            }

            System.out.println();
        }

    }
}
