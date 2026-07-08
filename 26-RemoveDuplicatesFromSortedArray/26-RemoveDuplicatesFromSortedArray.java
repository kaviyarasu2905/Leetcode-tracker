// Last updated: 08/07/2026, 15:42:55
class Solution {
    public int removeDuplicates(int[] nums) {
     int k=0;
     for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            k++;
            nums[k]=nums[i];
        }
     }   
     return k+1;
    }
}