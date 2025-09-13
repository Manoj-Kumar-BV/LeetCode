import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vow = new HashMap<>();
        Map<Character, Integer> con = new HashMap<>();

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c=='i' || c== 'o' || c=='u'){
                vow.put(c, vow.getOrDefault(c,0)+1);
            }else{
                con.put(c,con.getOrDefault(c,0)+1);
            }
        }
        int max_vow = vow.isEmpty() ? 0 : Collections.max(vow.values());
        int max_cons = con.isEmpty() ? 0 : Collections.max(con.values());

        return max_vow + max_cons;
    }
}