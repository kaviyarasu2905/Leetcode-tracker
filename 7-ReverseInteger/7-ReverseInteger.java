// Last updated: 08/07/2026, 15:43:12
class Solution {
    public int reverse(int x) {
        int temp=x;
        int rev=0;
        while(x!=0){
            int di=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE /10){
                return 0;
            }
            rev=rev*10+di;
            x=x/10;
        }
        return rev;
    }
}