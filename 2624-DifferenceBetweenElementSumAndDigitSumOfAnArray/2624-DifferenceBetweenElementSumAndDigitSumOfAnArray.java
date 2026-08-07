// Last updated: 07/08/2026, 09:57:15
class Solution {
    public int differenceOfSum(int[] nums) {
      int e=0;
      int d=0;
      for(int i=0;i<nums.length;i++){
        e+=nums[i];
        int temp=nums[i];
        while(temp!=0){
            d+=temp%10;
            temp/=10;
        }
      }  
      return Math.abs(e-d);
    }
}