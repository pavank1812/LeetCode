class Solution {
public:
  int maxScore(vector<int>& nums) {
    const int l = nums.size();
    vector<int> dp(1 << l);    
    for (int mask = 0; mask < 1 << l; ++mask) {
      int c = __builtin_popcount(mask);
      if (c & 1) continue; // only do in pairs
      int k = c / 2 + 1;
      for (int i = 0; i < l; ++i)
        for (int j = i + 1; j < l; ++j)
          if ((mask & (1 << i)) + (mask & (1 << j)) == 0) {            
            int new_mask = mask | (1 << i) | (1 << j);            
            dp[new_mask] = max(dp[new_mask],
                               k * gcd(nums[i], nums[j]) + dp[mask]);
        }
    }
    return dp[(1 << l) - 1];
  }
};
