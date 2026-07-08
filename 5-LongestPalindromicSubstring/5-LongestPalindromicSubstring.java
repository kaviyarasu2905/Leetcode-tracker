// Last updated: 08/07/2026, 15:43:13
class Solution {
    public boolean ispalin(String s){
        int i = 0, j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        String LongPalin = "";

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <= n; j++){
                String str = s.substring(i, j);
                if(ispalin(str) && str.length() > LongPalin.length()){
                    LongPalin = str;
                }
            }
        }
        return LongPalin;
    }
}
