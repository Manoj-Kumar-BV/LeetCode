class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] result = new int[nums.length];
        // for(int i=0; i<nums.length; i++){
        //     int product = 1;
        //     for(int j=0; j<nums.length; j++){
        //         if(j != i){
        //             product *= nums[j];
        //         }
        //     }
        //     result[i] = product;
        // }
        // return result;

        int[] result = new int[nums.length];
        int prefixprod[] = new int[nums.length];
        int suffixprod[] = new int[nums.length];

        prefixprod[0] = nums[0];
        suffixprod[nums.length-1] = nums[nums.length-1];

        for(int i=1; i<nums.length; i++){
            prefixprod[i] = prefixprod[i-1] * nums[i]; 
        }

        for(int i=nums.length-2; i>=0; i--){
            suffixprod[i] = nums[i] * suffixprod[i+1];
        }

        result[0] = suffixprod[1];

        result[nums.length-1] = prefixprod[nums.length-2];

        for(int i=1; i<nums.length-1; i++){
            result[i] = prefixprod[i-1] * suffixprod[i+1];
        }

        return result;
    }
}