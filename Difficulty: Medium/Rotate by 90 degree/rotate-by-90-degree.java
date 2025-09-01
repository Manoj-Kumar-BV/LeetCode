// User function Template for Java

class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        int n = mat.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int row=0; row<mat.length; row++){
            int first = 0;
            int last = mat[row].length-1;
            
            while(first < last){
                int temp = mat[row][first];
                mat[row][first] = mat[row][last];
                mat[row][last] = temp;
                first++;
                last--;
            }
        }
    }
}