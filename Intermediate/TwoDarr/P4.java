package Intermediate.TwoDarr;

// print all diagonals from right to left

/*

public class Solution {
    public int[][] diagonal(int[][] A) {

        int m = A.length;
        int n = A[0].length;

        int[][] ans = new int[2*m-1][n];
        int M = 0;

        // 1st half
        for(int i = 0; i < n; i++) {
            int row = 0, col = i, N = 0;

            while(row < m && col >= 0) {
                ans[M][N] = A[row][col];
                row++;
                col--;
                N++;
            }
            M++;
        }

        // 2nd half
        for(int i = 1; i < m; i++) {
            int row = i, col = n-1, N = 0;

            while(row < m && col >= 0) {
                ans[M][N] = A[row][col];
                row++;
                col--;
                N++;
            }
            M++;
        }

        return ans;
    }
}

*/

// tc - O(M*N)
public class P4 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int m = mat.length; // no of rows
        int n = mat[0].length; // no of columns

        // 1st half of matrix
        for (int i = 0; i < n; i++) {
            int row = 0, col = i;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }

            System.out.println();
        }

        // 2nd half of matrix
        for (int i = 1; i < m; i++) {
            int row = i, col = n - 1;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }

            System.out.println();
        }

    }
}
