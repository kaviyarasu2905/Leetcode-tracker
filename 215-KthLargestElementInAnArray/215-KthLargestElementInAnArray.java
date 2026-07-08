// Last updated: 08/07/2026, 15:40:41
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        return (nums[n-k]);
    }
}