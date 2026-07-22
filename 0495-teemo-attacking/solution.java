class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int sum=0;
        for(int i=0;i<t.length-1;i++){
            if(t[i+1]<=t[i]+d-1){
                sum+=t[i+1]-t[i];
            }else{
                sum+=d;
            }
        }
        sum+=d;
        return sum;
    }
}
