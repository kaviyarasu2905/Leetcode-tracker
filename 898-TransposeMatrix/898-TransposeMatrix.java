// Last updated: 08/07/2026, 15:39:00
class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int new_arr[][]=new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                new_arr[j][i]=matrix[i][j];
            }
        }
        return new_arr;
    }
}