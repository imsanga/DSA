package JavaRefresher.ConditionStm_Loops;

/*
# Problem: Check Prime Number

## Problem Description
Take an integer A as input and determine whether it is a prime number.

A prime number is a natural number greater than 1 that is divisible only by 1 and itself.

Print "YES" if A is a prime number, otherwise print "NO".

---

## Input Format
The first and only line contains a single integer A.

---

## Output Format
Print "YES" if A is a prime number, otherwise print "NO".

---

## Example Input

3

---

## Example Output

YES

*/

import java.lang.*;
import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // prime numbers -- has 2 factors (1 & itself)
        // composite numbers -- has more than 2 factors

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
            if (count > 2) {
                System.out.print("NO");
                break;
            }
        }
        if (count == 2) {
            System.out.print("YES");
        }

    }
}
