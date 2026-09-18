import java.util.*;
class Solution {
    public static String removeOuterParentheses(String s) {
        Deque<Character> ans = new ArrayDeque<>();
        StringBuilder s_ans = new StringBuilder();
        char left = '(';
        char right = ')';
        int left_count = 0;
        int right_count = 0;
        for(int i = s.length() - 1;i >= 0;i--){
            char temp = s.charAt(i);
            if(temp == right){
                right_count++;
                ans.push(temp);
            }
            if(temp == left){
                left_count++;
                ans.push(temp);
            }
            if(left_count == right_count && ans.peek() == left){
                int temp1 = ans.pop();
                StringBuilder temp_string = new StringBuilder();
                while(ans.size() > 1){
                    temp_string.append(ans.pop());
                }
                s_ans.append(temp_string.reverse());
                int temp2 = ans.pop();
                left_count = 0;
                right_count = 0;
            }
        }
        return s_ans.reverse().toString();
    }
}