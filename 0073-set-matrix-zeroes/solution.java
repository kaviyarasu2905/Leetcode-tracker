class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer>zrows=new HashSet<>();
        Set<Integer>zcols=new HashSet<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    zrows.add(i);
                    zcols.add(j);
                }
            }
        }
        for(int r:zrows){
            for(int i=0;i<m;i++){
                matrix[r][i]=0;
            }
        }for(int c:zcols){
            for(int j=0;j<n;j++){
                matrix[j][c]=0;
            }
        }
    }
}
