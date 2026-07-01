class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int window=0;
        for(int i=0;i<k;i++){
            window+=nums[i];
        }
        int b=window;
int o=0;
        for(int i=k;i<nums.length;i++){
            window+=nums[i];
            window-=nums[i-k];
            b=Math.max(b,window);
            
        }
        return (double)b/k;
    }
}
