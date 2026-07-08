// Last updated: 08/07/2026, 15:39:50
class Solution {
    public int countSegments(String s) {
        
        if(s.length() == 0) return 0;
        String words[]=s.split(" ");
        int cnt=0;
        for(String str : words)
        {
            if(!str.isEmpty())
            cnt++;
        }
        return cnt;
        
    }
}