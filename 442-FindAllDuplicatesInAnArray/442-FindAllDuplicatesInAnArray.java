// Last updated: 08/07/2026, 15:39:48
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ll= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
        if(arr[index]<0){
            ll.add(Math.abs(arr[i]));
        }else{
            arr[index]=arr[index]*-1;
        }
        }
        return ll;
    }
}