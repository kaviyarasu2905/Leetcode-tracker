class Solution {
    public String toLowerCase(String s) {
        String ans = "";

        for(int i=0;i<s.length();i++){
            int ascii = (int) s.charAt(i);
            if(ascii >= 65 && ascii <= 90){
                ascii += 32;
                ans += (char) ascii;
            }else{
                ans+= (char) ascii;
            }
        }
        return ans;
    }
}
