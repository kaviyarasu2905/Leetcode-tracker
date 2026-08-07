// Last updated: 07/08/2026, 09:59:20
class Solution {
    public int numOfStrings(String[] patterns, String word) {
     int c=0;
     for(String p:patterns){
        if(word.contains(p)){
            c++;
        }
     }   
     return c;
    }
}