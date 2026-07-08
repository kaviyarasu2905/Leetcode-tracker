// Last updated: 08/07/2026, 15:40:09
class Solution {
    public boolean isPowerOfThree(int n) {
       while(n<=0) return false;
       while(n%3==0){
        n/=3;
       } 
       return n==1; 
    }
}