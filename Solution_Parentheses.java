
// provides stack data structure
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        // create stack to hold opening chars, and int indexes for the string
        Stack<Character> parentheses = new Stack<>();
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            // start at the first char
            char cursor = s.charAt(start);

            // if char is an opening bracket, parentheses, etc push onto stack
            if (cursor == '(' || cursor == '{' || cursor == '[') {
                parentheses.push(cursor);
            }

            // if cursor is closing char -> is the stack empty? if not is the top element in stack the matching char?
            // true     => continue processing
            // false    => not valid
            else if (cursor == ')' && parentheses.size() != 0) {
                if (parentheses.peek() == '(') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (cursor == '}' && parentheses.size() != 0) {
                if (parentheses.peek() == '{') {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else if (cursor == ']' && parentheses.size() != 0) {
                if (parentheses.peek() == '[') {
                    parentheses.pop();
                } else {
                    return false;
                }
            }
            // programs should never reach here, if valid chars used in s
            else {
                return false;
            }

            // increment index
            start++;
        }

        // after processing list should be empty...did each char have its matching char?
        if (parentheses.empty()) {
            return true;
        }
        return false;
    }
}
