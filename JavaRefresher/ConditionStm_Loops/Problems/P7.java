package JavaRefresher.ConditionStm_Loops.Problems;

/*
# Problem: Least Common Multiple (LCM)

## Problem Description
Take two positive integers A and B as input and print their Least Common Multiple (LCM).

The LCM of two numbers is the smallest positive integer that is divisible by both A and B.

---

## Input Format
The first and only line contains two space-separated integers A and B.

---

## Output Format
Print a single integer representing the LCM of A and B.

---

## Example Input

2 3

---

## Example Output

6

*/

import java.lang.*;
import java.util.*;

// LCM (Least Common Multiple) is the smallest common multiple of two numbers.
public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int max = Math.max(A, B);
        int min = Math.min(A, B);
        int i = 1;

        while (true) {
            if (max * i % min == 0) {
                System.out.print(max * i);
                break;
            }
            i++;
        }
    }
}