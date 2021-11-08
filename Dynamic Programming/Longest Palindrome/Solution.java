class Solution {
    public String longestPalindrome(String s) {
//         j must be greater than or equal i at all times. Why? i is the start index of the substring, j is the end index of the substring. It makes no sense for i to be greater than j. Visualization helps me, so if you visualize the dp 2d array, think of a diagonal that cuts from top left to bottom right. We are only filling the top right half of dp.

// Why are we counting down for i, but counting up for j? Each sub-problem dp[i][j] depends on dp[i+1][j-1] (dp[i+1][j-1] must be true and s.charAt(i) must equal s.charAt(j) for dp[i][j] to be true).
        int n = s.length();
        String res = null;
        boolean[][] dp = new boolean[n][n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}