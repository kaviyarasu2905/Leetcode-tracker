// Last updated: 08/07/2026, 15:40:02
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> map2=new ArrayList<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                map2.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int []ans=new int[map2.size()];
        for(int i=0;i<map2.size();i++){
            ans[i]=map2.get(i);
        }
        return ans;
    }
}