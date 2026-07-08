// Last updated: 08/07/2026, 15:37:47
class Solution {
    public int[] buildArray(int[] nums) {
      int ans[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        ans[i]=nums[nums[i]];
      }  
      return ans;
    }
}