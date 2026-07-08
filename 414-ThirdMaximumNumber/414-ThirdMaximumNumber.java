// Last updated: 08/07/2026, 15:39:51
class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        if(list.size()>=3){
            return list.get(2);
        }else{
            return list.get(0);
        }
    }
}