class Solution {
    public void moveZeroes(int[] nums) {
        
        // step 1: collect all non-zero elements
        List<Integer> nonZero = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero.add(nums[i]);
            }
        }
        
        // step 2: put non-zero elements back
        for (int i = 0; i < nonZero.size(); i++) {
            nums[i] = nonZero.get(i);
        }
        
        // step 3: fill remaining with zeros
        for (int i = nonZero.size(); i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
