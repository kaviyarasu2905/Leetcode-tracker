// Last updated: 08/07/2026, 15:43:10
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rev=0;
        while(x>0){
            int di=x%10;
            rev=rev*10+di;
            x=x/10;
        }if(temp==rev){
            return true;
        }else{
            return false;
        }
    }
}