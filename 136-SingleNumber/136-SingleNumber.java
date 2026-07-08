// Last updated: 08/07/2026, 15:41:30
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int n:nums){
            r=r^n;
        }
        return r;
    }
}