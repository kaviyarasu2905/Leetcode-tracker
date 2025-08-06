class Solution {
    public int intVal(char ch){
        if(ch=='I')return 1;
        else if(ch=='V')return 5;
        else if(ch=='X')return 10;
        else if(ch=='L')return 50;
        else if(ch=='C')return 100;
        else if(ch=='D')return 500;
        else if(ch=='M')return 1000;
        else return 0;
    }
    public int romanToInt(String s) {
        int sum=0;
        int n=s.length();
        int i=0;
        for(i=0;i<s.length()-1;i++){
            char s1=s.charAt(i);
            char s2=s.charAt(i+1);
            if(intVal(s1)<intVal(s2)){
                sum+=intVal(s2);
                sum-=intVal(s1);
                i++;
            }else{
                sum+=intVal(s1);
            }
        }
        if(i!=n){
            sum=sum+intVal(s.charAt(n-1));
        }
        return sum;
    }
}
