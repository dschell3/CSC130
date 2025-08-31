// provides stack data structure
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> parenthesis = new Stack<>();
        int start = 0;
        int end = s.length() - 1;

        while ( start <= end )
        {
            // start at the first char
            char cursor = s.charAt(start);

            // if char is an opening bracket, parenthesis, etc push onto stack
            if (cursor == '(' || cursor == '{' || cursor == '[')
            {
                parenthesis.push(cursor);
            }
            
            // else if a closing bracket, parenthesis, etc has its matching char at top of stack
            else if (cursor == ')' && parenthesis.size() != 0)
            {
                // does the closing symbol having a matching open symbol at the top of the stack
                // true     => continue processing
                // false    => not valid
                if (parenthesis.peek() == '(')
                {
                    parenthesis.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (cursor == '}' && parenthesis.size() != 0)
            {
                if (parenthesis.peek() == '{')
                {
                    parenthesis.pop();
                }
                else
                {
                    return false;
                }
            }
            else if (cursor == ']' && parenthesis.size() != 0)
            {
                if (parenthesis.peek() == '[')
                {
                    parenthesis.pop();
                }
                else
                {
                    return false;
                }
            }
            // programs should never reach here, if valid chars used in s
            else
            {
                return false;
            }

            start++;
        }

        // is the list empty...did each char have its matching char?
        if (parenthesis.empty())
        {
            return true;
        }
        return false;
    }
}
