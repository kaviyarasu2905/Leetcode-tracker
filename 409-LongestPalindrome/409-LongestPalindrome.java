// Last updated: 08/07/2026, 15:39:54
class Solution {
    public int longestPalindrome(String s) {
        int[] fre = new int[256];  // use 256 for all ASCII characters
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);  // DON'T convert!
            fre[ch]++;  // use ch directly as index
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for(int i = 0; i < fre.length; i++){
            int c = fre[i];
            length += (c / 2) * 2;
            
            if(c % 2 == 1){
                hasOdd = true;
            }
        }
        
        if(hasOdd){
            length += 1;
        }
        
        return length;
    }
}