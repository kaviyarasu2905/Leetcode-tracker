// Last updated: 08/07/2026, 15:37:30
class Solution {
    public String firstPalindrome(String[] words) {
      for(int i=0;i<words.length;i++){
        String word=words[i];
        int left=0;
        int right=word.length()-1;
        boolean is =true;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                is=false;
                break;
            }
            left++;
            right--;
        }
        if(is){
            return word;
        }
      }  
      return "";
    }
}