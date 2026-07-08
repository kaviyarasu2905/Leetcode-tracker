// Last updated: 08/07/2026, 15:38:03
class Solution {
    public int diagonalSum(int[][] mat) {
      int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][n-1-i];
            sum+=mat[i][i];
        }if(n%2==1) {
            sum-=mat[n/2][n/2];
        }
        return sum;  
    }
}