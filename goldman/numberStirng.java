package goldman;

public class numberStirng {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];

        // Base cases
        dp[0] = 1;  // An empty string has one way to decode
        dp[1] = s.charAt(0) != '0' ? 1 : 0;  // The first character can't be '0'

        // Build the dp array
        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            // If the one digit number is valid (1-9), it contributes dp[i-1]
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // If the two digit number is valid (10-26), it contributes dp[i-2]
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
