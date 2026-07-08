// Last updated: 08/07/2026, 15:42:12
class Solution {
    	public static boolean binarysearch(int []arr,int k){
	    int low=0;
	    int high =arr.length-1;
	    while(low<=high){
	        int mid=low+(high-low)/2;
	        if(arr[mid]==k) return true;
	        if(arr[mid]<k){
	            low=mid+1;
	        }else{
	            high=mid-1;
	        }
	    }
	    return false;
	}
    public boolean searchMatrix(int[][] arr, int k) {
       int row=arr.length;
       for(int i=0;i<row;i++){
        if(binarysearch(arr[i],k)){
            return true;
        }
       } 
       return false;                                         
    }
}