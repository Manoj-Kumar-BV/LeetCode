class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int finalsum = (n*(n+1))/2;
        for(int i : nums){
            sum += i;
        }
        return finalsum-sum;
    }
}