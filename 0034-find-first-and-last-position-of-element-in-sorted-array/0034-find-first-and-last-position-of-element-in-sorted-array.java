class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result[] = new int[2];
        int first = First(nums, target);
        int last = Last(nums, target);

        result[0] = first;
        result[1] = last;
        return result;
    }

    private int First(int[] nums, int target){
        int L = 0, R = nums.length-1, result = -1;
        while(L <= R){
            int mid = (L+R)/2;
            if(nums[mid] == target){
                result = mid;
                R = mid - 1; //to find first occurence logically left side 
            }else if(nums[mid] < target){
                L = mid + 1;
            }else{
                R = mid - 1;
            }
        }
        return result;
    }

    private int Last(int[] nums, int target){
        int L = 0, R = nums.length-1, result = -1;
        while(L <= R){
            int mid = (L+R)/2;
            if(nums[mid] == target){
                result = mid;
                L = mid + 1;//to search last occurence logically right side
            }else if(nums[mid] < target){
                L = mid + 1;
            }else{
                R = mid - 1;
            }
        }
        return result;
    }
}