// Last updated: 08/07/2026, 15:41:15
class Solution {
    public String convertToTitle(int n) {
       String ans="";
       while(n!=0){
        n--;
        int r=n%26;
        char ch=(char)('A'+r);
        ans=ch+ans;
        n/=26;
       } 
       return ans;
    }
}