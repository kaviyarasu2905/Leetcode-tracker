// Last updated: 08/07/2026, 15:37:45
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}