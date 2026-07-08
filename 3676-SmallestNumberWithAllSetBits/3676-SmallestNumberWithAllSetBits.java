// Last updated: 08/07/2026, 15:36:36
class Solution {
    public int smallestNumber(int n) {
        for (int i = 0; i <= n; i++) {
            int z = 1 << i;
            if (z > n) return z - 1;
        }
        return 0;
    }
}