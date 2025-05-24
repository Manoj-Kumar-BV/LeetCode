class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            int digits = 0;
            if(nums[i] == 0){
                digits = 1;
            }else{
                int temp = nums[i];
                while(temp >0){
                    temp /= 10;
                    digits++;
                } 
            }

            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}