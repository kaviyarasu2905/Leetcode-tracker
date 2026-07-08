// Last updated: 08/07/2026, 15:38:30
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n!=0){
            int di=n%10;
            sum+=di;
            pro*=di;
            n=n/10;
        }
        int r=pro-sum;
        return r;
    }
}