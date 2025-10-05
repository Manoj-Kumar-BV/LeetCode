class Solution {
    public int alternatingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum = 0;
        int odd = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                sum += nums[i];
            }
            if(i%2 != 0){
                odd += nums[i];
            }
        }
        return sum-odd;
        
    }
}