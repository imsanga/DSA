package Intermediate.TwoDarr;

// addition of matrix

public class P8 {
    public int[][] solve(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = A[i][j] + B[i][j];
            }
        }

        return ans;
    }
}
