import java.util.*;

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();

        // frequency map for array a
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // check against array b
        for (int num : b) {
            if (freq.containsKey(num) && freq.get(num) > 0) {
                result.add(num);
                freq.put(num, freq.get(num) - 1); // reduce count to allow duplicates
            }
        }

        // sort result before returning
        Collections.sort(result);
        return result;
    }
}
