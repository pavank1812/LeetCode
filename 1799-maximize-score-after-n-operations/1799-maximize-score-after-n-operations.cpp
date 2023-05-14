class Solution {
public:
  int maxScore(vector<int>& nums) {
    const int l = nums.size();
    vector<int> cache(1 << l);
    function<int(int)> dp = [&](int mask) {      
      if (mask == 0) return 0;
      int& ans = cache[mask];
      if (ans > 0) return ans;
      const int k = (l - __builtin_popcount(mask)) / 2 + 1;
      for (int i = 0; i < l; ++i)
        for (int j = i + 1; j < l; ++j)
          if ((mask & (1 << i)) && (mask & (1 << j)))
            ans = max(ans, k * gcd(nums[i], nums[j])
                           + dp(mask ^ (1 << i) ^ (1 << j)));
      return ans;
    };
    return dp((1 << l) - 1);
  }
};