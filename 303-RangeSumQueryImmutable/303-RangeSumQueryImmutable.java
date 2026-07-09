// Last updated: 09/07/2026, 20:39:30
class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++)
            sum += nums[i];

        return sum;
    }
}