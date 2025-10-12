class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if(n<2){
            return n;
        }
        int max = 2;
        int curr = 2;

        for(int i=2; i<n;i++){
            if(nums[i] == nums[i-1] + nums[i-2]){
                curr++;
                max = Math.max(curr,max);
            }else{
                curr = 2;
            }
        }
        return max;
    }
}