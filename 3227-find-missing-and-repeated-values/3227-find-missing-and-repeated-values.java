class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int total = n*n;
        boolean[] seen = new boolean[total + 1];
        int ans[] = new int[2];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int val = grid[i][j];
                if(seen[val]){
                    ans[0] = val;
                }else{
                    seen[val] = true;
                }
            }
        }

        for(int i=1; i<=total; i++){
            if(!seen[i]){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}