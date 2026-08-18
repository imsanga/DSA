package Intermediate.prefixSum_carryForward.problems;

// special index - after removing the element, sum of even = sum of odd

// tc - O(N)
public class P7 {
    public int solve(int[] A) {
        int n = A.length;

        int[] evenPfx = new int[n];
        int[] oddPfx = new int[n];

        evenPfx[0] = A[0];
        oddPfx[0] = 0;
        for (int i = 1; i < n; i++) {
            // even prefix array
            if (i % 2 == 0) {
                evenPfx[i] = evenPfx[i - 1] + A[i];
            } else {
                evenPfx[i] = evenPfx[i - 1];
            }

            // odd prefix Array
            if (i % 2 != 0) {
                oddPfx[i] = oddPfx[i - 1] + A[i];
            } else {
                oddPfx[i] = oddPfx[i - 1];
            }
        }

        int count = 0;
        for (int j = 0; j < n; j++) {
            int even, odd;

            if (j == 0) {
                even = oddPfx[n - 1] - oddPfx[j];
                odd = evenPfx[n - 1] - evenPfx[j];
            } else if (j == n - 1) {
                even = evenPfx[j - 1];
                odd = oddPfx[j - 1];
            } else {
                even = evenPfx[j - 1] + oddPfx[n - 1] - oddPfx[j];
                odd = oddPfx[j - 1] + evenPfx[n - 1] - evenPfx[j];
            }

            if (even == odd)
                count++;
        }

        return count;

    }
}
