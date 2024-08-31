package goldman;

public class Encryption {
    public static int[] encryptionValidity(int instructionCount, int validityPeriod, int[] keys) {
        int n = keys.length;
        int maxDivisibility = 0;

        // 计算每个元素的可整除性（divisibility count）
        for (int i = 0; i < n; i++) {
            int divisibilityCount = 0;
            for (int j = 0; j < n; j++) {
                if (keys[i] % keys[j] == 0) {
                    divisibilityCount++;
                }
            }
            // 找到最大的可整除性
            maxDivisibility = Math.max(maxDivisibility, divisibilityCount);
        }

        // 计算加密强度
        int encryptionStrength = maxDivisibility * 100000;

        // 计算劫持者能够测试的密钥数量
        long totalKeysTested = (long) instructionCount * validityPeriod;

        // 判断是否能够破解加密
        int canBreak = totalKeysTested >= encryptionStrength ? 1 : 0;

        return new int[]{canBreak, encryptionStrength};
    }
}
