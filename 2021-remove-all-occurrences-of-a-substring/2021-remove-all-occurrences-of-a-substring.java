import java.util.*;

class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            res.append(s.charAt(i));

            if(res.length() >= part.length() && res.substring(res.length()-part.length()).equals(part)){
                res.delete(res.length()-part.length(), res.length());
            }
        }
        return res.toString();
    }
}