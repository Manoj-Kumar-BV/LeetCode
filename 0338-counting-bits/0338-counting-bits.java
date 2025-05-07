class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i=0; i<ans.length; i++){
            ans[i] = countsetbits(i);
        }
        return ans;
    }
    private int countsetbits(int n){
        int count = 0;
        while(n>0){
            int lsb = n&1;
            if(lsb == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}