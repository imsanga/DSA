package Intermediate.TwoDarr;

public class P9 {
    public int solve(int[] A) {
        int n = A.length;
        int countTriplets = 0;

        // take middle annd calculate left and right count
        for (int i = 0; i < n; i++) {
            int leftCount = 0;
            int rightCount = 0;

            // leftCount
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i])
                    leftCount++;
            }

            // rightCount
            for (int k = i + 1; k < n; k++) {
                if (A[k] > A[i])
                    rightCount++;
            }

            countTriplets += leftCount * rightCount;
        }

        return countTriplets;
    }
}
