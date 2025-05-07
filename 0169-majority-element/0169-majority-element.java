class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int start = 0, end = nums.length;
        while(start <= end){
            int mid = (start+end)/2;
            return nums[mid];
        }

        return 0;
    }
}