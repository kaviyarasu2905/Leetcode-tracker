// Last updated: 08/07/2026, 15:39:10
class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            sb.append(Character.toLowerCase(ch));
        }
        return sb.toString();
    }
}