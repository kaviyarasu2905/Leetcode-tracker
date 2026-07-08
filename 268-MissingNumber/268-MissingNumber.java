// Last updated: 08/07/2026, 15:40:19
class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(i,1);
        }
        for(int i:nums){
            map.remove(i);
        }
        for(int i:map.keySet()){
            return i;
        }return n;
    }
}