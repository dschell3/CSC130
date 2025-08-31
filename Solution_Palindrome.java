class Solution {
    public boolean isPalindrome(String s) {
        
        // create index for start and end of s
        int start = 0;
        int end = s.length() - 1;

        while (start < end)
        {
            // create pointers to each end of the string
            char left_cursor = s.charAt(start);
            char right_cursor = s.charAt(end);
            
            // if left_cursor isn't alphanumeric, ignore and advance to the right
            if (!Character.isLetterOrDigit(left_cursor))
            {
                start++;
            }
            // else if right_cursor isn't alphanumeric, ignore and advance to the left
            else if (!Character.isLetterOrDigit(right_cursor))
            {
                end--;
            }
            // both cursors point to alphanumeric chars 
            else
            {
                // make both lower case, do they match? if no, not a palindrome
                if (Character.toLowerCase(left_cursor) != Character.toLowerCase(right_cursor))
                {
                    return false;
                }
                // chars matched, advance both towards the middle and continue loop
                start++;
                end--;
            }
        }

        // entire string was processed, each corresponding char matched. String is a palindrome
        return true;
        
    }
}
