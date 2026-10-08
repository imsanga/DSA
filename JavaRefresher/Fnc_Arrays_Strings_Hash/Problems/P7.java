package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

// string reverse

public class P7 {
    public String solve(String A) {
        // using StringBuilder
        // StringBuilder sb = new StringBuilder(A);

        // return sb.reverse().toString();

        // using String
        String ans = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            ans += A.charAt(i);
        }

        return ans;

    }
}
