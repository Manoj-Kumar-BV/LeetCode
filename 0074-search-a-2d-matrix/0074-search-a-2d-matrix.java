class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target){
                return true;
            }
            else if(target < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
    }
}