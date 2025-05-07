class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder w1 = new StringBuilder(word1);
        StringBuilder w2 = new StringBuilder(word2);
        StringBuilder merged = new StringBuilder("");

        int i=0,j=0;
        while((i<w1.length()) || (j<w2.length())){
            if(i<w1.length()){
                merged.append(w1.charAt(i));
                i++;
            }
            if(j<w2.length()){
                merged.append(w2.charAt(j));
                j++;
            }
        }
        return merged.toString();
    }
}