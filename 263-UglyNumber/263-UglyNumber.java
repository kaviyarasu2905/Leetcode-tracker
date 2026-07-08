// Last updated: 08/07/2026, 15:40:21
class Solution {
    public boolean isUgly(int num) {
        while(num<=0) return false;
        while(num % 2 == 0) num /= 2;
    while(num % 3 == 0) num /= 3;
    while(num % 5 == 0) num /= 5;
    
    return num == 1;
    }
}