/*

169. Majority Element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

Constraints:
n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109

*/

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int elem = 0;

        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                elem = nums[i];
            }
            else if(elem == nums[i]) count++;
            else count--;
        }

        int count1 = 0;
        for(int i = 0;i < n; i++){
            if(elem == nums[i]){
                count1++;
            } 
            if(count1 > n/2){
                return elem;
            }
        }
        return -1;
    }
}


/*
# Intuition
A majority element in an array is an element that appears more than half of the total number of elements. The goal is to find this element efficiently. The key intuition here is to use the **Boyer-Moore Voting Algorithm**. This algorithm relies on counting to determine a candidate that could be the majority element and then verifying it in a second pass.

# Approach
1. **Finding the Candidate (Boyer-Moore Voting Algorithm)**
   - Initialize `count` to zero and `elem` to any value (like zero).
   - Iterate through the array `nums`.
     - If `count` is zero, set `elem` to the current element and `count` to 1.
     - If the current element is the same as `elem`, increment `count`.
     - If not, decrement `count`.
   - After this loop, `elem` is the candidate for the majority element.

2. **Verifying the Candidate**
   - Initialize `count1` to zero.
   - Iterate through the array again to count how many times `elem` appears.
   - If `count1` is greater than `n/2`, return `elem` as the majority element.
   - If not, return -1 (though this case shouldn't happen if there's a guaranteed majority element).

# Time Complexity
- **Time complexity**: O(n), where `n` is the length of the array. This is because we have two loops, but each loop iterates through the array only once.

# Space Complexity
- **Space complexity**: O(1). The algorithm uses a constant amount of extra space for counters and the candidate variable. No additional data structures are required, as the entire algorithm runs in-place.
*/