// Last updated: 08/07/2026, 15:43:15
class Solution {
    public int lengthOfLongestSubstring(String s) {
     Set<Character> bag=new HashSet<>();
     int left=0;
     int best=0;
     for(int r=0;r<s.length();r++){
        char c=s.charAt(r);
        while(bag.contains(c)){
            bag.remove(s.charAt(left));
            left++;
        }
        bag.add(c);
        best=Math.max(best,r-left+1);
     }  
     return best; 
    }
}