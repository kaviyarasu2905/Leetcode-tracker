class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int ascii = (int) ch;
            if ((ascii >= 97 && ascii <= 122) || (ascii >= 48 && ascii <= 57)) {
                ans += ch;
            }
        }
        String rev = "";
        for (int i = ans.length() - 1; i >= 0; i--) {
            rev += ans.charAt(i);
        }
        return ans.equals(rev);
    }
}

