class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=-n/2; i<=n/2; i++){
            ans.add(i);
        }
        if(n%2==0){
            ans.remove(n/2);
        }
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}