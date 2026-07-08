// Last updated: 08/07/2026, 15:38:26
class Solution {
    public int numberOfSteps(int n) {
      int c=0;
      while(n!=0){
        if(n%2==0){
            n=n/2;
        }else{
            n=n-1;
        }
         c++;
      }  
      return c;
    }
}