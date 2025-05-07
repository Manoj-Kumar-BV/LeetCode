class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String newS = s.replaceAll("[^A-Za-z0-9]", "");

        String lc = newS.toLowerCase();

        for(int i=0; i<lc.length()/2; i++){
            if(lc.charAt(i) != lc.charAt(lc.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}