class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int currentJump = 0;
        int maxReach = 0;
        int minJumps = 0;
        
        for(int i = 0; i < n-1; i++){
            maxReach = Math.max(maxReach, i + nums[i]);
                
                if(i == currentJump){
                    currentJump = maxReach;
                    minJumps++;
                }
        }
        return minJumps;
    }
}

