class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            String s = String.valueOf(nums[i]);  
            int digitCount = s.length();
            
            if(digitCount % 2 == 0){
                count++;
            }
        }
        
        return count;
    }
}
