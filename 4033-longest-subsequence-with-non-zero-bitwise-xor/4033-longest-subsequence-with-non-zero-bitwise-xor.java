class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        boolean all = true;
        
        for(int num : nums){
            total ^= num;
            if(num != 0){
                all = false;
            }
        }

        if(all){
            return 0;
        }
        if(total != 0){
            return nums.length;
        }
        return nums.length-1;
    }
}