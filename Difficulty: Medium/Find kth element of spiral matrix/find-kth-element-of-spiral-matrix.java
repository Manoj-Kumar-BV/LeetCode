class Solution {
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k) {
        // Your code here
        List<Integer> result = new ArrayList<>();
        
        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;
        
        while(sr <= er && sc <= ec){
            
            for(int j=sc; j<=ec; j++){
                result.add(A[sr][j]);
            }
            for(int i=sr+1; i<=er; i++){
                result.add(A[i][ec]);
            }
            for(int j=ec-1; j>=sr; j--){
                if(sr == er)    break;
                result.add(A[er][j]);
            }
            for(int i=er-1; i>=sr+1; i--){
                if(sc == ec)    break;
                result.add(A[i][sr]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        return result.get(k-1);
    }
}