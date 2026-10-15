package Intermediate.exam;

/*
# Problem: Toy Factory

## Problem Description

In a toy factory, there are `N` toy blocks arranged in a row. Each toy block has a color represented by an integer in the array `A` of size `N`.

Find the length of the longest contiguous subarray in which every element is either divisible by `4` or divisible by `5`.

---

## Problem Constraints

- `|A| = N`
- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`

---

## Input Format

The first argument `A` is an array of integers.

---

## Output Format

Return a single integer representing the length of the longest contiguous subarray satisfying the given condition.

---

## Example Input

### Input 1

A = [4, 1, 10, 15]

### Input 2

A = [1, 9, 2]

---

## Example Output

### Output 1

2

### Output 2

0

---

## Example Explanation

### Explanation 1

Using 0-based indexing, the subarray `[10, 15]` at indices `[2, 3]` is the longest contiguous subarray satisfying the condition. Both elements are divisible by `5`, so the output is `2`.

### Explanation 2

There is no contiguous subarray satisfying the condition. Hence, the output is `0`.

*/

public class P3 {
    public static void main(String[] args) {
        int[] arr = { 4, 1, 10, 15 };

        int count = 0;
        int n = arr.length, maxy = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 4 == 0 || arr[i] % 5 == 0) {
                count++;
                maxy = Math.max(maxy, count);
            } else {
                count = 0;
            }
        }

        System.out.println(maxy);
    }
}
