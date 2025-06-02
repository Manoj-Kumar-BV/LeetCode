class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result = 0;
        for(int i=0; i<k; i++){
            result += nums[i];
        }
        double ms = result;

        for(int i=k; i<nums.length; i++){
            result += nums[i] - nums[i-k];
            ms = Math.max(ms,result);
        }
        return ms/k;
    }
}