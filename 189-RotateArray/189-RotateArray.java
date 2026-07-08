// Last updated: 08/07/2026, 15:41:01
class Solution {
    public void rotate(int[] nums, int k) {
       int r[]=new int[nums.length];
       k=k%nums.length;
       for(int i=0;i<nums.length;i++){
        r[(i+k)%nums.length]=nums[i];
       } 
       for(int i=0;i<nums.length;i++){
        nums[i]=r[i];
       }
    }
}