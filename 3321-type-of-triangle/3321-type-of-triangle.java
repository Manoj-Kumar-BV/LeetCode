class Solution {
    public String triangleType(int[] nums) {
        if (!((nums[0] + nums[1] > nums[2]) && (nums[0] + nums[2] > nums[1]) && (nums[1] + nums[2] > nums[0]))){
            return "none";
            
        }else{
            if(nums[0] == nums[1] && nums[1] == nums[2]){
                return "equilateral";
            }else if((nums[0] == nums[1]) || (nums[0] == nums[2] || nums[1] == nums[2])){
                return "isosceles";
            }else{
                return "scalene";
            }
        }
    }
}

/*
class Solution {
    public String triangleType(int[] nums) {

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if(a==b && b==c) {
            return "equilateral";
        } else if (a+b<=c || b+c<=a || c+a<=b) {
            return "none";
        } else if(a==b || b==c || c==a){
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}

Better Approach
*/
