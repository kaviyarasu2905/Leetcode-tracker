// Last updated: 08/07/2026, 15:38:17
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=Math.max(max,candies[i]);
        }
        List<Boolean> r=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >=max){
            r.add(true);
        }else{
            r.add(false);
        }
        }
        return r;
    }
}