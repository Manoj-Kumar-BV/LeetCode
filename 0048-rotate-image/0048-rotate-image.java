class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
    }

    private void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        reverse(matrix);
    }

    private void reverse(int[][] mat){
        for(int row = 0; row<mat.length; row++){
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