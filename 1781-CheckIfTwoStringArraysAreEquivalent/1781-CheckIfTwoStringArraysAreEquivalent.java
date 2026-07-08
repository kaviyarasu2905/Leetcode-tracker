// Last updated: 08/07/2026, 15:37:55
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (String w : word1) {
            a += w;
        }
        for (String w : word2) {
            b += w;
        }
        return a.equals(b);
    }
}