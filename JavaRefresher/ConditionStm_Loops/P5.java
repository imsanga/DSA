package JavaRefresher.ConditionStm_Loops;

/*
# Problem: Armstrong Numbers from 1 to N

## Problem Description
Take an integer N as input and print all Armstrong numbers from 1 to N (inclusive).

An Armstrong number is a number that is equal to the sum of the cubes of its digits.

For example:
153 = (1³) + (5³) + (3³) = 153

Note: All test cases are limited to 3-digit numbers.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print all Armstrong numbers in the range 1 to N, each on a new line.

---

## Example Input

200

---

## Example Output

1
153

*/

import java.lang.*;
import java.util.*;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i, ans = 0;
            while (temp > 0) {
                int dummy = temp % 10;
                ans += dummy * dummy * dummy;
                temp /= 10;
            }
            if (ans == i)
                System.out.println(ans);
        }
    }
}
