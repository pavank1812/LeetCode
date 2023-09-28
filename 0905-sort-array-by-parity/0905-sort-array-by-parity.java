class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1)
            return nums;
        
        int start = 0 , end = nums.length - 1;
        while(start<end) {
            if(nums[start] %2==0){
                start++;
            }else{
                if(nums[end]%2 !=0){
                    end--;
                }else{
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
            }
        }
        return nums;
    }
}




