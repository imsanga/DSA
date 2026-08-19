package Intermediate.slidingWindow_contribution;

// max subarray with length k

/*

// tc - O(N^2)
public class P2 {
    public static void main(String[] args) {
        int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int n = arr.length;
        int k = 5;

        int maxSubarraySum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxSubarraySum = Math.max(sum, maxSubarraySum);
        }

        System.out.println("max subarray with length k is: " + maxSubarraySum);
    }
}

*/

// tc - O(N) -- sliding window technique
public class P2 {
    public static void main(String[] args) {
        int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
        int n = arr.length;
        int k = 5;

        int sum = 0;

        // sum from 0 -> n-k
        for (int i = 0; i < n - k; i++)
            sum += arr[i];

        // iterate the array
        int maxSubarraySum = sum, endIndex = k;
        for (int j = 1; j < n - k + 1; j++) {
            sum = sum - arr[j - 1] + arr[endIndex];
            maxSubarraySum = Math.max(sum, maxSubarraySum);
            endIndex++;
        }

        System.out.println("max subarray with length k is: " + maxSubarraySum);
    }
}
