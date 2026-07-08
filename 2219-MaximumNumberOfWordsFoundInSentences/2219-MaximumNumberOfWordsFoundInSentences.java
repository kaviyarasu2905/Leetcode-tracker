// Last updated: 08/07/2026, 15:37:32
class Solution {
    public int mostWordsFound(String[] sentences) {
     int max=0;
     for(int i=0;i<sentences.length;i++){
        String s=sentences[i];
        int sp=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==' '){
                sp++;
            }
        }
            int w=sp+1;
            max=Math.max(max,w);
        } 
        return max;
    }
}