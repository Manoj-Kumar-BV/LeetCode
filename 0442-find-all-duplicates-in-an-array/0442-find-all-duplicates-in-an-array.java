import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> check = new HashMap<>();

        for(int num : nums){
            if(check.containsKey(num)){
                check.put(num, check.get(num)+1);
            }else{
                check.put(num, 1);
            }
        }
        for(Integer i : check.keySet()){
            if(check.get(i) > 1){
                result.add(i);
            }
        }
        return result;
    }
}