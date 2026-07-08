// Last updated: 08/07/2026, 15:40:06
class Solution {
    public static boolean vowel(char v) {
        if(v=='a' || v == 'A' || v == 'e' || v == 'E' || v == 'i' || v == 'I' || v == 'o' || v == 'O' || v == 'u' || v == 'U'){
            return true;
        }return false;
    }
    public String reverseVowels(String s) {
         char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        while (start < end) {
            if (!vowel(ch[start])) {
                start++;
            } else if (!vowel(ch[end])) {
                end--;
            } else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }String res=new String(ch);
        return res;
    }
}