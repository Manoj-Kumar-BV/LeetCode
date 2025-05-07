class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] q1 = s.toCharArray();
            char[] q2 = t.toCharArray();

            Arrays.sort(q1);
            Arrays.sort(q2);

            if(Arrays.equals(q1,q2)){
                return true;
            }
        }
        return false;
    }
}