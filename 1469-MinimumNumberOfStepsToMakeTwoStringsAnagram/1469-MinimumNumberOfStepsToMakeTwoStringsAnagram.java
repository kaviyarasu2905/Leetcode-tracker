// Last updated: 08/07/2026, 15:38:22
class Solution {
    public int minSteps(String s, String t) {
        // Frequency arrays for both strings
        int[] countS = new int[26];
        int[] countT = new int[26];
        
        // Count the frequency of each character in s
        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }
        
        // Count the frequency of each character in t
        for (char c : t.toCharArray()) {
            countT[c - 'a']++;
        }
        
        // Calculate the number of steps required
        int steps = 0;
        
        // Calculate how many characters in s need to be changed to match t
        for (int i = 0; i < 26; i++) {
            if (countS[i] > countT[i]) {
                steps += countS[i] - countT[i];  // Excess characters in s
            }
        }
        
        return steps;
    }
}
