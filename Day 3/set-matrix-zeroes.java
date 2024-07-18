73. Set Matrix Zeroes

https://leetcode.com/problems/set-matrix-zeroes/description/

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] x = new int[row];
        int[] y = new int[col];
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    x[i] =-1;
                    y[j]=-1;
                }
            }
        }
        for(int i =0; i < row; i++) {
            for(int j =0; j< col; j++) {
                if(x[i] == -1 || y[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}