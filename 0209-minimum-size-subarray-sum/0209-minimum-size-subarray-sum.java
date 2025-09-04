class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    //     List<List<Integer>> result = getsubarrays(nums);
    //     int length = Integer.MAX_VALUE;
    //     for(List<Integer> subarray : result){
    //         int sum = 0;
    //         for(int num : subarray){
    //             sum += num;
    //         }
    //         if(sum >= target){
    //             length = Math.min(length, subarray.size());
    //         }
    //     }

    //     return (length == Integer.MAX_VALUE) ? 0 : length;
    // }
    // private List<List<Integer>> getsubarrays(int[] nums){
    //     List<List<Integer>> sub = new ArrayList<>();
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i; j<nums.length; j++){
    //             List<Integer> temp = new ArrayList<>();
    //             for(int k=i; k<=j; k++){
    //                 temp.add(nums[k]);
    //             }
    //             sub.add(temp);
    //         }
    //     }
    //     return sub;
    // }
    int length = Integer.MAX_VALUE;
    int sum = 0;
    int left = 0;
    for(int right = 0; right<nums.length; right++){
        sum += nums[right];
        while(sum >= target){
            length = Math.min(length, right-left+1);
            sum -= nums[left];
            left++;
        }
    }
    return (length == Integer.MAX_VALUE) ? 0 : length;
    } 
}  