class Solution {

    public int minKBitFlips(int[] nums, int k) {
        
        boolean[] flipped = new boolean[nums.length];
        int validFlipsFromPastWindow = 0;
        int flipCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                if (flipped[i - k]) {
                    validFlipsFromPastWindow--;
                }
            }

            if (validFlipsFromPastWindow % 2 == nums[i]) {
                if (i + k > nums.length) {
                    return -1;
                }
                validFlipsFromPastWindow++;
                flipped[i] = true;
                flipCount++;
            }
        }

        return flipCount;
    }
}