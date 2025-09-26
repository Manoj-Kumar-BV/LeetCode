class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int result = 0;

        // for(int i=0; i<s.length(); i++){
        //     for(int j=i; j<s.length(); j++){
        //         String substr = s.substring(i,j+1);
        //         if(isunique(substr)){
        //             result = Math.max(result,substr.length());
        //         }
        //     }
        // }
        // return result;

        int left = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right<s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result = Math.max(result, right-left + 1);
        }
        return result;
    }

    // private boolean isunique(String s){
    //     Set<Character> result = new HashSet<>();
    //     for(char c : s.toCharArray()){
    //         if(result.contains(c))  return false;
    //         result.add(c);
    //     }
    //     return true;
    // }
}