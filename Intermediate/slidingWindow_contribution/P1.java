package Intermediate.slidingWindow_contribution;

// total subarray sum

/*

// tc - O(N^3) - bruteforce
public class P1 {
    public static void main(String[] args) {
        // int[] arr = {10, 20, 30, 40};
        int[] arr = { 3, 2, 5 };
        int n = arr.length;
        int count = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                count++;
                System.out.print(count + " -> ");
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("Total subarray count is: " + count);
        System.out.println("Total subarray sum is: " + sum);
    }
}

// tc - O(N^2) - prefix sum
public class P1 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5 };
        int n = arr.length;
        int sum = 0;

        // prefix sum array
        int[] pfx = new int[n];
        pfx[0] = arr[0];
        for (int p = 1; p < n; p++)
            pfx[p] = pfx[p - 1] + arr[p];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int left = i, right = j;

                if (left == 0)
                    sum += pfx[right];
                else
                    sum += pfx[right] - pfx[left - 1];
            }
        }

        System.out.println("Total subarray sum is: " + sum);
    }
}

// tc - O(N^2) - carryForward
public class P1 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5 };
        int n = arr.length;

        int totalSubarraySum = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0, totalSum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                totalSum += sum;
            }

            totalSubarraySum += totalSum;
        }

        System.out.println("Total subarray sum is: " + totalSubarraySum);
    }
}

*/

// tc - O(N) - carryForward
public class P1 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5 };
        int n = arr.length;

        int totalSubarraySum = 0;
        for (int i = 0; i < n; i++) {
            totalSubarraySum += arr[i] * (i + 1) * (n - i);
        }

        System.out.println("Total subarray sum is: " + totalSubarraySum);
    }
}
