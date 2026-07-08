// Last updated: 08/07/2026, 15:37:17
class Solution {
    public int commonFactors(int a, int b) {
        int n=Math.min(a,b);
        int c=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                c++;
            }
        }
        return c;
    }
}