class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder str = new StringBuilder("");
        int j = 0;
        for(int i=0; i<t.length(); i++){
            if(j<s.length() && t.charAt(i) == s.charAt(j)){
                str.append(t.charAt(i));
                j++;
            }
        }
        if(str.toString().equals(s)){
            return true;
        }
        return false;
    }
}