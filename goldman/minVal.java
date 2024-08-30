package goldman;

public class minVal {
    public static long minStart(int[] arr) {
        long runningSum = 0;
        long minRunningSum = 0;

        for (int num : arr) {
            runningSum += num;
            if (runningSum < minRunningSum) {
                minRunningSum = runningSum;
            }
        }

        if (minRunningSum >= 0) {
            return 1;
        } else {
            return 1 - minRunningSum;
        }
    }
}
