// Last updated: 08/07/2026, 15:37:48
class Solution {
    public String truncateSentence(String s, int k) {
     String arr[]=s.split(" ");
     String res[]=new String[k];
     int index=0;
     for(int i=0;i<k;i++){
        res[index++]=arr[i];
     }
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<res.length;i++){
        sb.append(res[i]+" ");
     }
     return sb.toString().trim();
    }
}