class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c=0;
        long s=0;
        for(int num:nums){
            if(num==0){
                s++;
                c+=s;
            }else{
                s=0;
            }
        }
        return c;
    }
}
