// Last updated: 08/07/2026, 15:39:12
class Solution {
    public int pivotIndex(int[] arr) {
        int pp=-1;
        int n=arr.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        suffix[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
           suffix[i]=arr[i]+suffix[i+1];
        }for(int i=0;i<n;i++){
            if(prefix[i]==suffix[i]) return i;
        }
        return pp;
    }
}