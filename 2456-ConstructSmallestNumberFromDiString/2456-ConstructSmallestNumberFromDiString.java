// Last updated: 08/07/2026, 15:37:21
class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> s=new Stack<>();
        int n=1;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<=pattern.length();i++){
            s.push(n);
            n++;
            if(i==pattern.length()||pattern.charAt(i)=='I'){
                while(!s.isEmpty()){
                    result.append(s.pop());
                }
            }
        }
        return result.toString();
    }
}