// Last updated: 08/07/2026, 15:42:45
class Solution {
    private int firstOccurance(int[] arr, int s, int e, int x){
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] >= x){
                if(arr[mid] == x) ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    private int lastOccurance(int[] arr, int s, int e, int x){
        int ans = -1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] <= x){
                if(arr[mid] == x) ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int first = firstOccurance(arr, 0, n-1, target);
        int last = lastOccurance(arr, 0, n-1, target);
        return new int[]{first, last};
    }
}