class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        if (s1.length != s2.length) {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2); 
    }
}
