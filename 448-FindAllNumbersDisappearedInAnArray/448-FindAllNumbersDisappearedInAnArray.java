// Last updated: 08/07/2026, 15:39:47
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
     List<Integer> ll=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i])-1;
        if(arr[index]<0){
           continue;
        }else{
            arr[index]=arr[index]*-1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                ll.add(i+1);
            }
        }
        return ll;
    }
}