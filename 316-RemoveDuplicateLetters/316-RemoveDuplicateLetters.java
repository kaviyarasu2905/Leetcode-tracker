// Last updated: 08/07/2026, 15:40:11
class Solution {
    public String removeDuplicateLetters(String s) {
        if (s.isEmpty()) return "";
        int[] last = new int[26];
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }
            if (i == last[s.charAt(i) - 'a']) {
                break; 
            }
        }
        char pick = s.charAt(pos);
        String rest = s.substring(pos + 1).replace(String.valueOf(pick), "");
        return pick + removeDuplicateLetters(rest);
    }
}