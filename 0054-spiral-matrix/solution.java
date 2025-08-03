class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll = new ArrayList<>();
        int row=arr.length;
        int col=arr[0].length;
        int top=0;
        int bot=row-1;
        int left=0;
        int right=col-1;
        int tot=row*col;
        int count=0;
        while(count<tot){
            //top wall;
        for(int j=left;j<=right &&count<tot;j++){
            ll.add(arr[top][j]);
            count++;
        }
        top++;
        //right wall
        for(int i=top;i<=bot && count<tot;i++){
            ll.add(arr[i][right]);
            count++;
        }
        right--;
        //bottom wall
        for(int j=right;j>=left && count<tot;j--){
            ll.add(arr[bot][j]);
            count++;
        }
        bot--;
        //left wall
        for(int j=bot;j>=top && count<tot;j--){
            ll.add(arr[j][left]);
            count++;
        }
        left++;
        }return ll;
    }
}
