class Solution {
    public int climbStairs(int n) {
        //determine how many additions can be made to get the n
        //return amount of ways that can be added to get to the top
        // base steps are only 1 and 2
        //basically fibonacci sequence
        int[] dp = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
          dp[i] = dp[i-1] + dp[i - 2];
        }
        return dp[n];
    }
}
