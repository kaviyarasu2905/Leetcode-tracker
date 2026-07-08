// Last updated: 08/07/2026, 15:40:07
class Solution {
    public void reverseString(char[] s) {
       int i=0;
       int j=s.length-1; 
       while(i<j){
        char t=s[i];
        s[i]=s[j];
        s[j]=t;
        i++;
        j--;
       }
    }
}