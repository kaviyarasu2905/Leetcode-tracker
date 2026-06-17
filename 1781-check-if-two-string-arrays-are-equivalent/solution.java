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
