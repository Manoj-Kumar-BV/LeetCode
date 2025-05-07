class Solution {
    public int removeElement(int[] nums, int val) {
        int n1 = nums.length;
        int[] nums2 = new int[n1];

        int k = 0;
        for(int i = 0; i<n1; i++){
            if(nums[i] != val ){
                nums[k]= nums[i];
                k++;
            }
        }
        
        return k;
    }
}