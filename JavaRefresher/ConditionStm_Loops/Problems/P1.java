package JavaRefresher.ConditionStm_Loops.Problems;

/*
# Problem: Count Digits

## Problem Description
Take T (number of test cases) as input. For each test case, take an integer N and print the number of digits in N.

Note: The number of digits in 0 is considered to be 1.

---

## Input Format
- The first line contains an integer T, the number of test cases.
- The next T lines each contain a single integer N.

---

## Output Format
For each test case, print the number of digits in N on a separate line.

---

## Example Input

2
100
10101

---

## Example Output

3
5

*/

import java.lang.*;
import java.util.*;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int t = sc.nextInt();
            int count = 0;

            if (t == 0)
                System.out.println(1);
            else {
                while (t > 0) {
                    count++;
                    t = t / 10;
                }
                System.out.println(count);
            }
        }
    }
}
