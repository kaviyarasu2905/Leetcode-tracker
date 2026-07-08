// Last updated: 08/07/2026, 15:42:11
class Solution {
    public void sortColors(int[] arr) {
         int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }    
        } 
    }
}