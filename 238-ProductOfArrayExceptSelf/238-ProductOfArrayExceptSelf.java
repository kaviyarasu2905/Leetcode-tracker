// Last updated: 08/07/2026, 15:40:30
class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int[] result = new int[n];
        int running = 1;
        for (int i = 0; i < n; i++) {
            result[i] = running;
            running = running * nums[i];
        }
        running = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * running;
            running = running * nums[i];
        }

        return result;  
    }
}