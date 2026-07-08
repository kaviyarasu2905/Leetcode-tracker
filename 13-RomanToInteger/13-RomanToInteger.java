// Last updated: 08/07/2026, 15:43:05
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;
        int n=s.length();
        int i=0;
        for(i=0;i<s.length()-1;i++){
            char s1=s.charAt(i);
            char s2=s.charAt(i+1);
            if(map.get(s1)<map.get(s2)){
                sum+=map.get(s2);
                sum-=map.get(s1);
                i++;
            }else{
                sum+=map.get(s1);
            }
        }
        if(i!=n){
            sum=sum+map.get(s.charAt(n-1));
        }
        return sum;
    }
}