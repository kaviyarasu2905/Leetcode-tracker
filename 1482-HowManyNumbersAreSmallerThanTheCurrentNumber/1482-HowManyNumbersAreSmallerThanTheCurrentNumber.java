// Last updated: 08/07/2026, 15:38:21
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] r = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int c = 0;
            for(int j = 0; j < nums.length; j++){  // j starts at 0, not i+1!
                if(nums[j] < nums[i]){              // strictly smaller check
                    c++;
                }
            }
            r[i] = c;                              // store count for each i
        }
        return r;
    }
}