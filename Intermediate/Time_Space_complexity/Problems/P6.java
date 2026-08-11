package Intermediate.Time_Space_complexity.Problems;

/*
# Problem: Count "ag" Pairs

## Problem Description
Given a string S consisting of lowercase English letters, count the total number of pairs (i, j) such that:

- S[i] = 'a'
- S[j] = 'g'
- i < j

In other words, count every occurrence of 'a' that appears before an occurrence of 'g'.

---

## Input Format
The first and only input is a string S.

---

## Output Format
Print a single integer representing the total number of "ag" pairs.

---

## Example Input

S = "bcaggaag"

---

## Example Output

Pairs count : 8

*/

// tc - O(N^2)
// sc - O(1)
public class P6 {
    public static void main(String[] args) {
        String s = "bcaggaag";
        int pairsCount = 0;

        for (int i = 0; i <= s.length() - 2; i++) {
            if (s.charAt(i) == 'a') {
                for (int j = i + 1; j <= s.length() - 1; j++) {
                    if (s.charAt(j) == 'g')
                        pairsCount++;
                    else
                        continue;
                }
            }
        }

        System.out.println("Pairs count : " + pairsCount);

    }
}

// optimised approach
// tc - O(N)
// sc - O(1)
public class P6 {
    public static void main(String[] args) {
        String s = "bcaggaag";
        int pairsCount = 0, countOfA = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'a')
                countOfA++;

            else if (s.charAt(i) == 'g')
                pairsCount += countOfA;

        }

        System.out.println("Pairs count : " + pairsCount);

    }
}
