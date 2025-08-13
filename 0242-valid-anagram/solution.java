class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char i:s.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(char i:t.toCharArray()){
            map1.put(i,map1.getOrDefault(i,0)-1);
            if(map1.get(i)<0) return false;
        }return true;
    }
}
