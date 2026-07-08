// Last updated: 08/07/2026, 15:42:30
class Solution {
    public int maxSubArray(int[] nums) {
        int c=nums[0];
        int b=nums[0];
        for(int i=1;i<nums.length;i++){
            c=Math.max(nums[i],c+nums[i]);
            b=Math.max(c,b);
        }
        return b;
    }
}