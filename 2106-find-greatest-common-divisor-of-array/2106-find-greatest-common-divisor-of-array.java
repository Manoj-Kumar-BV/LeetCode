class Solution {
    public int findGCD(int[] nums) {
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < small){
                small = nums[i];
            }
            if(nums[i] > large){
                large = nums[i];
            }
        }
        while(large != 0 ){
            int temp = large;
            large = small % large;
            small = temp;
        }
        return small;

    }
}