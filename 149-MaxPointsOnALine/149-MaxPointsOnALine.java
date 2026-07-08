// Last updated: 08/07/2026, 15:41:22
import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;
        int maxPoints = 0;
        for (int i = 0; i < points.length; i++) {
            Map<String, Integer> slopeCount = new HashMap<>();
            int duplicates = 0;
            int currMax = 0;
            for (int j = i + 1; j < points.length; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0 && dy == 0) { 
                    duplicates++;
                    continue;
                }
                int gcd = gcd(dy, dx);
                dy /= gcd;
                dx /= gcd;
                String slopeKey = dx + "/" + dy;
                slopeCount.put(slopeKey, slopeCount.getOrDefault(slopeKey, 0) + 1);
                currMax = Math.max(currMax, slopeCount.get(slopeKey));
            }
            maxPoints = Math.max(maxPoints, currMax + duplicates + 1); 
        }
        return maxPoints;
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
