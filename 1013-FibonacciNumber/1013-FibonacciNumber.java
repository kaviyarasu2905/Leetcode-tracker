// Last updated: 08/07/2026, 15:38:50
class Solution {
    public int fib(int n) {
       if(n==0){
        return 0;
       }if(n==1){
        return 1;
       } int a=0;
       int b=1;
       for(int i=2;i<=n;i++){
       int tem=a+b;
       a=b;
       b=tem;
       }
       return b;
    }
}