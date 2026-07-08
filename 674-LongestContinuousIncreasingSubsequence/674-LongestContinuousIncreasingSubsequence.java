// Last updated: 08/07/2026, 15:39:16
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int ans=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
            }else{
                c=1;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}