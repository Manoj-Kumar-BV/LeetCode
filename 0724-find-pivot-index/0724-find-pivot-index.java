class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum += nums[i];
        }
        int leftsum = 0;
        int rightsum = 0;
        for(int i=0; i<nums.length; i++){
            rightsum = totalsum - leftsum - nums[i];

            if(leftsum == rightsum){
                return i;
            }else{
                leftsum += nums[i];
            }
        }
        return -1;   
    }
}