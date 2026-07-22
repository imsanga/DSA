package JavaRefresher.Lab_Session_Patterns;

/*
# Problem: Star Pattern - Stair Pattern

## Problem Description
Take an integer N as input and print the corresponding stair pattern.

For example, if N = 4:

*
**
***
****

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the stair pattern in N lines, where the i-th line contains i stars (*).

---

## Example Input

2

---

## Example Output

*
**

*/

import java.lang.*;
import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // stars
        for (int rows = 1; rows <= N; rows++) {
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
