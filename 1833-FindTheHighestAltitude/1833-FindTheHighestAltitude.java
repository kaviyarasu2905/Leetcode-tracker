// Last updated: 07/08/2026, 09:59:35
class Solution {
    public int largestAltitude(int[] gain) {
        int m=0;
        int c=0;
        for(int g:gain){
            c+=g;
            m=Math.max(m,c);
        }
        return m;
    }
}