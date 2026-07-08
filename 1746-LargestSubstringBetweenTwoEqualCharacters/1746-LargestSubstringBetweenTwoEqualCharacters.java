// Last updated: 08/07/2026, 15:37:58
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int len=s.length();
        int ans=-1;
        int indf=0;
        int indl=0;
        char c;
        for(int i=0;i<len;i++){
           c=s.charAt(i);
           indf=s.indexOf(c);
           indl=s.lastIndexOf(c);
           if(indl!=indf){
           ans=Math.max(ans,indl-indf-1);
           }  
            
            }
        return ans;
    }
}