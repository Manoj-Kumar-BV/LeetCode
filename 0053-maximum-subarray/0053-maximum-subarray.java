class Solution {
    public int maxSubArray(int[] nums) {
        int current = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            current += nums[i];

            maxsum = Math.max(current, maxsum);

            if(current < 0){
                current = 0;
            }
        }

        return maxsum;
    }
}