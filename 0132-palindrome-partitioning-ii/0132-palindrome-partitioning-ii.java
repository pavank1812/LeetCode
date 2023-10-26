class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            int minCuts = i; 
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 1 || isPalindrome[j + 1][i - 1])) {
                    isPalindrome[j][i] = true;
                    if (j == 0) {
                        minCuts = 0;
                    } else {
                        minCuts = Math.min(minCuts, dp[j - 1] + 1);
                    }
                }
            }
            dp[i] = minCuts;
        }

        return dp[n - 1];
    }
}
