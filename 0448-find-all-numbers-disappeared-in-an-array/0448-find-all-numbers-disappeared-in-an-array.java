import java.util.Hashtable;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Hashtable<Integer, Integer> check = new Hashtable<>();

        for(int num : nums){
            check.put(num,1);
        }
        for(int i=1; i<=nums.length; i++){
            if(!check.containsKey(i)){
                result.add(i);
            }
        }
        return result;
    }
}