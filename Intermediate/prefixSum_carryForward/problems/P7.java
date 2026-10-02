package Intermediate.prefixSum_carryForward.problems;

// special index - after removing the element, sum of even = sum of odd

// tc - O(N)
public class P7 {
    public int solve(int[] A) {
        int n = A.length;

        // prefix even & prefix odd
        int[] pfxEven = new int[n];
        int[] pfxOdd = new int[n];

        pfxEven[0] = A[0];
        pfxOdd[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                pfxEven[i] = pfxEven[i - 1] + A[i];
            } else {
                pfxEven[i] = pfxEven[i - 1];
            }

            if (i % 2 != 0) {
                pfxOdd[i] = pfxOdd[i - 1] + A[i];
            } else {
                pfxOdd[i] = pfxOdd[i - 1];
            }
        }

        // count special index
        int count = 0;
        for (int j = 0; j < n; j++) {
            int sumOfEven, sumOfOdd;
            if (j == 0) {
                sumOfEven = pfxOdd[n - 1] - pfxOdd[j];
                sumOfOdd = pfxEven[n - 1] - pfxEven[j];
            } else if (j == n - 1) {
                sumOfEven = pfxEven[j - 1];
                sumOfOdd = pfxOdd[j - 1];
            } else {
                sumOfEven = pfxEven[j - 1] + (pfxOdd[n - 1] - pfxOdd[j]);
                sumOfOdd = pfxOdd[j - 1] + (pfxEven[n - 1] - pfxEven[j]);
            }

            if (sumOfEven == sumOfOdd)
                count++;
        }

        return count;
    }
}
