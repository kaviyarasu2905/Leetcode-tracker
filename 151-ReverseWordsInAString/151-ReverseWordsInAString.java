// Last updated: 08/07/2026, 15:41:20
class Solution {
    public String reverseWords(String s) {
        // Trim spaces at start and end
        s = s.trim();

        // Split by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
