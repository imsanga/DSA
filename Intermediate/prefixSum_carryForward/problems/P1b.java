package Intermediate.prefixSum_carryForward.problems;

// Range Sum Query -- 1 based indexing

import java.util.Arrays;

public class P1b {
    public static void main(String[] args) {

        // test case 1:
        int[] arr = { 1, 2, 3, 4, 5 };

        int[][] query = {
                { 1, 4 },
                { 2, 3 }
        };

        // test case 2:
        // int[] arr = {2, 2, 2};

        // int[][] query = {
        // {1, 1},
        // {2, 3}
        // };

        int n = arr.length;

        // prefix Sum array
        long[] pfxSum = new long[n + 1];
        pfxSum[0] = 0;
        for (int i = 1; i <= n; i++) {
            pfxSum[i] = pfxSum[i - 1] + arr[i - 1];
        }

        int nb = query.length;
        long[] ans = new long[nb];
        for (int i = 0; i < nb; i++) {
            int left = query[i][0], right = query[i][1];
            if (left == 1) {
                ans[i] = pfxSum[right];
            } else {
                ans[i] = pfxSum[right] - pfxSum[left - 1];
            }
        }

        System.out.print(Arrays.toString(ans));
    }
}
