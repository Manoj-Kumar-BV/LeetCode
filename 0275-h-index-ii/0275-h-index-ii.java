class Solution {
    public int hIndex(int[] citations) {
        int left = 0;
        int right = citations.length-1;
        int n = citations.length;

        while(left <= right){
            int mid = (left + right)/2;

            int paper = n - mid;

            if(citations[mid] >= paper){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return n-left;
    }
}