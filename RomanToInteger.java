/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 
Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 ṇ
Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/


class Solution {
    public int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }
}


/*
# Intuition
Roman numerals represent numbers using a combination of letters (I, V, X, L, C, D, M). Each letter has a specific value, and in some cases, a smaller numeral before a larger numeral indicates subtraction (e.g., IV is 4). To convert a Roman numeral to an integer, you can iterate through the string from right to left, adding or subtracting values depending on the sequence.

# Approach
1. **Mapping Roman Numerals to Values**: First, understand the value of each Roman numeral:
   - 'I' = 1, 'V' = 5, 'X' = 10, 'L' = 50, 'C' = 100, 'D' = 500, 'M' = 1000.
2. **Initialize `ans` to 0**: This variable will store the final integer value.
3. **Loop through the String from Right to Left**:
   - Determine the value of the current Roman numeral.
   - If this value is less than `ans / 4`, subtract it from `ans`. This condition helps identify subtraction cases like IV (4), IX (9), etc.
   - Otherwise, add the value to `ans`.
4. **Return the Integer Value**: After processing the entire string, `ans` contains the integer representation of the Roman numeral.

# Time Complexity
- **Time complexity**: O(n), where `n` is the length of the string `s`. The algorithm involves a single loop through the string.

# Space Complexity
- **Space complexity**: O(1). The code uses only a constant amount of extra space for a few variables (`ans`, `num`) and doesn't require additional data structures or arrays.
*/