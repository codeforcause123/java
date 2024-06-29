import java.io.*;
import java.util.*;

class minsteps {
    public static int memoization(int n, int k, int[] dp) {
        if (n == k) {
            return 0; // If n is already equal to k, no steps needed.
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        
        int steps = 1 + memoization(n - 1, k, dp);

        if (n % 2 == 0) {
            steps = Math.min(steps, 1 + memoization(n / 2, k, dp));
        }

        if (n % 3 == 0) {
            steps = Math.min(steps, 1 + memoization(n / 3, k, dp));
        }

        dp[n] = steps;
        return steps;
    }

    public static int countStepsToK(int n, int k) {
        int[] dp = new int[Math.max(n, k) + 1];
        Arrays.fill(dp, -1);
        int result = memoization(n, k, dp);
        return result;
    }

    public static void main(String args[]) {
        int n = 75;
        int k = 25;
        int result = countStepsToK(n, k);
        System.out.println("Minimum steps to reach " + k + " from " + n + ": " + result);
    }
}
