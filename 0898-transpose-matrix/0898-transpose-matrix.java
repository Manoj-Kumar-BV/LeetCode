class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;  //Row
        int m = matrix[0].length;   //Column

        int [][] ans = new int[m][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}