// Last updated: 08/07/2026, 15:40:58
class Solution {
    public int hammingWeight(int n) {
        int j=0;
        while(n!=0){
            int d=n%2;
            j+=d;
            n/=2;
        }
        return j;
    }
}