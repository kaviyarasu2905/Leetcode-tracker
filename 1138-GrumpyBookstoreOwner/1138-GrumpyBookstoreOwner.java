// Last updated: 08/07/2026, 15:38:45
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int k) {
        int already=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                already+=customers[i];
            }
        }
        int window=0;
        for(int i=0;i<k;i++){
            if(grumpy[i]==1){
                window+=customers[i];
            }
        }
        int b=window;
        for(int i=k;i<customers.length;i++){
            if(grumpy[i]==1){
                window+=customers[i];
            }
            if(grumpy[i-k]==1){
                window-=customers[i-k];
            }
            b=Math.max(b,window);
        }
        return already+b;
    }
}