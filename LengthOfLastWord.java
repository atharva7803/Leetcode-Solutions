/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 
Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            else if (length > 0) {
                break;
            }
        }
        
        return length;
    }
}

/* 

# Intuition
The goal of the code is to find the length of the last word in a given string. A word is defined as a sequence of non-space characters, and there may be leading or trailing spaces. The key is to reverse iterate over the string to find the last word, counting its length as we go.

# Approach
1. **Trim Leading and Trailing Spaces**: Use `s.trim()` to remove any leading and trailing spaces from the input string `s`.
2. **Initialize `length` to 0**: This variable will keep track of the length of the last word.
3. **Reverse Iterate through the String**: Start from the end of the string and go backward.
   - If the current character is not a space, increment `length` to count the characters in the last word.
   - If the current character is a space and `length` is greater than 0, it means we've reached the beginning of the last word, so break the loop.
4. **Return the Length**: After completing the loop, `length` holds the length of the last word.

# Time Complexity
- **Time complexity**: O(n), where `n` is the length of the input string `s`. This is because we loop through the string once, albeit in reverse.
# Space Complexity
- **Space complexity**: O(1). The only extra memory used is a constant variable `length` to store the count of the last word's characters. Other than that, no additional data structures are used.
*/
