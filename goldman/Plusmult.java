package goldman;

public class Plusmult {
    public static String plusMult(int[] A) {
        long R_even = 1;
        long R_odd = 1;
        int n = A.length;

        // Calculate R_even and R_odd
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                R_even *= A[i];
            } else {
                R_odd *= A[i];
            }
        }

        // Modulo 2 the results
        R_even = R_even % 2;
        R_odd = R_odd % 2;

        // Determine the result
        if (R_odd > R_even) {
            return "ODD";
        } else if (R_even > R_odd) {
            return "EVEN";
        } else {
            return "NEUTRAL";
        }
    }
}
