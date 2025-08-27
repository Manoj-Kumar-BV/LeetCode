class Solution {
    public int maxArea(int[] height) {
        // int max = 0;
        // for(int i=0; i<height.length; i++){
        //     for(int j=i+1; j<height.length; j++){
        //         int width = j-i;
        //         int h = Math.min(height[i], height[j]);
        //         int area = width * h;
        //         max = Math.max(max,area);
        //     }
        // }
        // return max;

        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = w * h;
            max = Math.max(max,area);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}