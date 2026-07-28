package JavaRefresher.Exam;

/*
 * # Problem: Two Sum
 * 
 * ## Problem Description
 * Given an integer array A and an integer B, determine whether there exists a
 * pair of distinct elements whose sum is equal to B.
 * 
 * The same array element cannot be used twice.
 * 
 * Return 1 if such a pair exists; otherwise, return 0.
 * 
 * ---
 * 
 * ## Input Format
 * - The first input is an integer array A.
 * - The second input is an integer B.
 * 
 * ---
 * 
 * ## Output Format
 * Return 1 if there exists a pair of elements whose sum is equal to B;
 * otherwise, return 0.
 * 
 * ---
 * 
 * ## Example Input
 * 
 * A = [2, 3, 1]
 * B = 3
 * 
 * ---
 * 
 * ## Example Output
 * 
 * 1
 * 
 */

public class P1 {
    public int solve(int[] A, int B) {

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B)
                    return 1;
            }
        }
        return 0;

    }
}
