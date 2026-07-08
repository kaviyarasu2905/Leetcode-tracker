// Last updated: 08/07/2026, 15:40:04
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency using an array (shift by 10000 for negative numbers)
        int[] count = new int[20001];
        for (int num : nums) {
            count[num + 10000]++;
        }
        
        // Step 2: Collect all numbers that actually appeared, with their frequency
        int[] values = new int[20001];
        int[] freqs = new int[20001];
        int size = 0;
        
        for (int i = 0; i < 20001; i++) {
            if (count[i] > 0) {
                values[size] = i - 10000; // shift back to real number
                freqs[size] = count[i];
                size++;
            }
        }
        
        // Step 3: Simple bubble sort - sort values based on freqs, highest first
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (freqs[j] < freqs[j + 1]) {
                    // swap freqs
                    int tempFreq = freqs[j];
                    freqs[j] = freqs[j + 1];
                    freqs[j + 1] = tempFreq;
                    // swap values
                    int tempVal = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tempVal;
                }
            }
        }
        
        // Step 4: Take the first k values
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = values[i];
        }
        
        return result;
    }
}