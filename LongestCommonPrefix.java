/*
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
*/


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}


/*

# Intuition
Finding the longest common prefix in an array of strings can be simplified by sorting the array. The common prefix between the first and last strings in the sorted array should be the same as the common prefix for the entire array. This is because the first and last strings represent the minimum and maximum values in lexicographical order, and the common prefix between them is the longest common prefix among all the strings.

# Approach
1. **Sort the Array**: Sort the array of strings using `Arrays.sort()`. This ensures that the first and last strings represent the minimum and maximum in lexicographical order.
2. **Compare First and Last Strings**:
   - Take the first string (`s1`) and the last string (`s2`).
   - Initialize an index `idx` to 0.
   - Compare characters at the same position in both strings while they match.
   - If they don't match or you reach the end of either string, stop the comparison.
3. **Return the Common Prefix**:
   - Use `s1.substring(0, idx)` to get the substring from the start to the point where characters differ.
   - This substring represents the longest common prefix.

# Time Complexity
- **Time complexity**: O(n log n), where `n` is the number of strings in the array. This is due to the sorting step. Additionally, comparing characters in the first and last strings takes linear time.
- **Space complexity**: O(1), as sorting is done in-place, and the code uses only constant extra space for comparison indices.

*/