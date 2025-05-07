class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0, high = nums.length-1;

        while(low < high){
            int mid = (low + high)/2;

            boolean isEven = (mid%2==0);

            if((isEven && nums[mid] == nums[mid+1]) || (!isEven && nums[mid] == nums[mid-1])){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
}