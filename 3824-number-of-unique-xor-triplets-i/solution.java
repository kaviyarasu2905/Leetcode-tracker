class Solution {
    public int uniqueXorTriplets(int[] arr) {
        int n = arr.length;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int high = Integer.highestOneBit(n);
        return (high << 1);
    }
}
