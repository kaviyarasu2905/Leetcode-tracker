class Solution {
    public boolean isPalindrome(String s) {
      s=s.toLowerCase();
      int i=0;
      int j=s.length()-1;
      boolean ispalindrome=true;
      while(i<j){
        while(i<j &&!Character.isLetterOrDigit(s.charAt(i))){
            i++;
        } 
        while(i<j &&!Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }
        if(s.charAt(i)!=s.charAt(j)){
            ispalindrome=false;
            break;
        }
        i++;
        j--;
      }
      if(ispalindrome) return true;
      else return false;
    }
}
