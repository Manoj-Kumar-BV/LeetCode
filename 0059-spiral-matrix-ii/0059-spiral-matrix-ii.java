class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int sr = 0, er = n-1;
        int sc = 0, ec = n-1;
        int num = 1;
        while(sr <= er && sc <= ec){
            
            for(int j=sc; j<=ec; j++){
                result[sr][j] = num;
                num++;
            }
            for(int i=sr+1; i<=er; i++){
                result[i][ec] = num;
                num++;
            }
            for(int j=ec-1; j>=sc; j--){
                if(sr == er)    break;
                result[er][j] = num;
                num++;
            }
            for(int i=er-1; i>=sr+1; i--){
                if(sc == ec)    break;
                result[i][sc] = num;
                num++;
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
        return result;
    }
}