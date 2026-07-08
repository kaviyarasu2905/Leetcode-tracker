// Last updated: 08/07/2026, 15:40:23
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int sum=0;
            while(num>0){
            sum+=num%10;
            num/=10;
            }
            num=sum;
        }
        return num;
    }
}