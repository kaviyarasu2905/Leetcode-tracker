// Last updated: 08/07/2026, 15:42:41
class Solution {
    public String countAndSay(int n) {
        String a = "1";
        for (int k = 1; k < n; k++) { 
            String s = "";
            int i = 0;

            while (i < a.length()) {
                int cnt = 1;
                while (i + 1 < a.length() && a.charAt(i) == a.charAt(i + 1)) {
                    cnt++;
                    i++;
                }
                s += cnt + "" + a.charAt(i);
                i++;
            }
            a = s;
        }
        return a; 
    }
}
