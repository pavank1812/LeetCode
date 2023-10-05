class Solution {
    public int rob(int[] nums) {
        int Robber = 0;
        int NotRobber = 0;
            
            for(int num : nums){
                int CurrentRobber = NotRobber + num;
                int CurrentNotRobber = Math.max(Robber, NotRobber);
                    
                NotRobber = CurrentNotRobber;
                Robber = CurrentRobber;
            }
        return Math.max(Robber, NotRobber);
    }
}


