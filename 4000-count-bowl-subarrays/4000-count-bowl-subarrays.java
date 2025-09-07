// class Solution {
//     public long bowlSubarrays(int[] nums) {
//         // long res = 0;
//         // List<List<Integer>> result = subarrays(nums);
//         // for(List<Integer> sub : result){
//         //     long min = Math.min(sub.get(0), sub.get(sub.size()-1));
//         //     long max = Integer.MIN_VALUE;
//         //     for(int i=1; i<sub.size()-1; i++){
//         //         max = Math.max(max, sub.get(i));
//         //     }
//         //     if(min > max)   res++;
//         // }
//         // return res;


//     }
//     // private List<List<Integer>> subarrays(int[] nums){
//     //     List<List<Integer>> sub = new ArrayList<>();

//     //     for(int i=0; i<nums.length; i++){
//     //         for(int j=i; j<nums.length; j++){
//     //             if(j-i+1 >=3){
//     //                 List<Integer> temp = new ArrayList<>();
//     //                 for(int k=i; k<=j; k++){
//     //                     temp.add(nums[k]);
//     //                 }
//     //                 sub.add(temp);
//     //             }
//     //         }
//     //     }
//     //     return sub;
//     // }
class Solution {
        public long bowlSubarrays(int[] A) {
        long res = 0;
        Stack<Integer> s = new Stack<>();
        for (int r = 0; r < A.length; ++r) {
            int a = A[r];
            while (!s.empty() && A[s.peek()] <= a) {
                int l = s.pop();
                if (r - l + 1 >= 3) {
                    res += 1;
                }
            }
            if (!s.empty() && r - s.peek() + 1 >= 3) {
                res += 1;
            }
            s.push(r);
        }
        return res;
    }
}