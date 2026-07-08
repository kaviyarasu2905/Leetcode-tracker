// Last updated: 08/07/2026, 15:42:49
class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> stk;
        stk.push(-1);  // Base index for valid parentheses
        int maxLength = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s[i] == '(') {
                stk.push(i);  // Push the index of '('
            } else {
                stk.pop();  // Pop the last '(' index
                
                if (stk.empty()) {
                    stk.push(i);  // Set the base index for the next valid substring
                } else {
                    // Calculate the length of the current valid parentheses substring
                    maxLength = max(maxLength, i - stk.top());
                }
            }
        }
        
        return maxLength;
    }
};
