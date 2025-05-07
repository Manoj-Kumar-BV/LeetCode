class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] nums3 = new int[n1+n2];

        for(int i =0; i<n1; i++){
            nums3[i] = nums1[i];
        }

        for(int j =0; j<n2;j++){
            nums3[n1+j] = nums2[j];
        }

        Arrays.sort(nums3);

        int len = nums3.length;

        if(len%2 == 1){
            return nums3[len/2];
        }
        else{
            return (nums3[(len/2)-1] + nums3[len/2]) /2.0;
        }
    }
}