class Solution {
    private boolean ispalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {
        String result = "";
        for(int i=0;i<words.length; i++){
            if(ispalindrome(words[i])){
                result = words[i];
                break;
            }
        }
        return result;
    }
}