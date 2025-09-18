class Solution {
    public int reverse(int x) {
       int rev=0;
      int num=x;
      while(num!=0){
          int rem=num%10;
          int prev=rev;
          rev=rev*10+rem;
          if((rev-rem)/10!=prev)
              return 0;
          num=num/10;
      }
      return rev;  
    }
}
