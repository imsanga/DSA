package Intermediate.TwoDarr;

/*
# Problem: Matrix Scalar Product

## Problem Description

You are given a matrix `A` and an integer `B`.

Perform scalar multiplication of matrix `A` by the integer `B`.

---

## Problem Constraints

- `1 <= A.size() <= 1000`
- `1 <= A[i].size() <= 1000`
- `1 <= A[i][j] <= 1000`
- `1 <= B <= 1000`

---

## Input Format

The first argument is a 2D array of integers `A` representing the matrix.

The second argument is an integer `B`.

---

## Output Format

Return a 2D array of integers after performing scalar multiplication of matrix `A` by `B`.

---

## Example Input

### Input 1

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

B = 2

### Input 2

A = [[1]]

B = 5

---

## Example Output

### Output 1

[[2, 4, 6],
 [8, 10, 12],
 [14, 16, 18]]

### Output 2

[[5]]

*/

import java.util.*;

public class P7 {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        int rows = A.size();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < A.get(i).size(); j++) {
                al.add(A.get(i).get(j) * B);
            }
            ans.add(al);
        }

        return ans;
    }
}
