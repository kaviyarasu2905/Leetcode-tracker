// Last updated: 07/08/2026, 09:56:54
class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        for(int i = 0; i < word.length(); i++)
            ans += (i / 8) + 1;
        return ans;
    }
}