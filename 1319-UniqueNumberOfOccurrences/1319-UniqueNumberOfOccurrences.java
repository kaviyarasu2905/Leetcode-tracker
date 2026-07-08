// Last updated: 08/07/2026, 15:38:35
import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count the frequency of each number
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Use a HashSet to check if frequencies are unique
        Set<Integer> occurrences = new HashSet<>();
        for (int freq : countMap.values()) {
            if (!occurrences.add(freq)) {
                return false; // Duplicate frequency found
            }
        }

        return true; // All frequencies are unique
    }
}
