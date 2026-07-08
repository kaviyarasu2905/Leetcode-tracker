// Last updated: 08/07/2026, 15:42:35
class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currEnd = 0;   
        int farthest = 0;  
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); 
            if (i == currEnd) {   
                jumps++;
                currEnd = farthest;  
            }
        }
        return jumps;
    }
}