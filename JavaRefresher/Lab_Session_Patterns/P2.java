package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Inverted Half Pyramid

## Problem Description
Take an integer N as input and print the corresponding Inverted Half Pyramid pattern.

For example, if N = 4:

****
***
**
*

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the inverted half pyramid pattern in N lines, where the first line contains N stars (*) and each subsequent line contains one less star.

---

## Example Input

2

---

## Example Output

**
*

*/

import java.lang.*;
import java.util.*;

public class P2 {
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
