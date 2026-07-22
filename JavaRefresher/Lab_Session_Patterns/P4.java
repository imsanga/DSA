package JavaRefresher.Lab_Session_Patterns;

import java.lang.*;
import java.util.*;

/*
# Problem: Star Pattern - Hollow Rectangle

## Problem Description
Take an integer N as input and print a hollow rectangle pattern consisting of N rows.

Each row should contain an asterisk (*) at the beginning and end, with N-2 spaces in between.

For example, if N = 4:

*  *
*  *
*  *
*  *

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the hollow rectangle pattern with N rows. If N = 2, print two stars (**) in each row.

---

## Example Input

4

---

## Example Output

*  *
*  *
*  *
*  *

*/

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n - 2;

        for (int i = 1; i <= n; i++) {

            System.out.print("*");

            // space
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            System.out.println("*");
        }
    }
}
