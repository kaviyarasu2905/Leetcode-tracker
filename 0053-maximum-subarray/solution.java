class Solution {
    public int maxSubArray(int[] nums) {
      int max=nums[0];
      int sub=0;
      for(int num:nums){
        sub+=num;
        max=Math.max(max,sub);
        if(sub<0) sub=0;
      }
      return max;
    }
}
