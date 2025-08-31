class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<friends.length; i++){
            set.add(friends[i]);
        }

        List<Integer> result = new ArrayList<>();
        for(int i=0; i<order.length; i++){
            if(set.contains(order[i])){
                result.add(order[i]);
            }
        }

        int[] ans = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}