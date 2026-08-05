package JavaRefresher.ConditionStm_Loops.Problems;

/*
# Problem: Print Factors and Count Them

## Problem Description
Given an integer N, print all of its factors in ascending order and also print the total number of factors.

A factor of a number is an integer that divides the number exactly without leaving a remainder.

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
- Print all the factors of N in ascending order.
- On the next line, print the total number of factors.

---

## Example Input

24

---

## Example Output

Factors of 24 -> 1 2 3 4 6 8 12 24
Total Factors -> 8

*/

public class P8 {
    public static void main(String[] args) {
        int n = 24, count = 0;

        System.out.print("Factors of " + n + " -> ");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.print("Total Factors -> " + count);

    }
}