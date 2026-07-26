package JavaRefresher.ConditionStm_Loops.Problems;

/*
# Problem: Perfect Number

## Problem Description
Take T (number of test cases) as input. For each test case, take an integer N and determine whether it is a perfect number.

A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself).

Print "YES" if N is a perfect number, otherwise print "NO".

---

## Input Format
- The first line contains an integer T, the number of test cases.
- The next T lines each contain a single integer N.

---

## Output Format
For each test case, print "YES" if the number is perfect, otherwise print "NO".

---

## Example Input

2
4
6

---

## Example Output

NO
YES

*/

import java.lang.*;
import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int t = sc.nextInt();
            int sum = 0;
            int flag = 0;

            for (int j = 1; j < t; j++) {
                if (t % j == 0) {
                    sum += j;
                }
                if (sum > t) {
                    System.out.println("NO");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                if (sum == t)
                    System.out.println("YES");
                else if (sum < t)
                    System.out.println("NO");
            }
        }
    }
}
