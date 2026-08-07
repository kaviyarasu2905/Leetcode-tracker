// Last updated: 07/08/2026, 10:02:47
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                m=Math.max(m,i-j+1);
            }
        }
        return m;
    }
}