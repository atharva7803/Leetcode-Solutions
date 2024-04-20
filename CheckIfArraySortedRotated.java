/*

1752. Check if Array is Sorted and Rotated

Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

 
Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.

Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 
Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100

*/

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        return count <= 1;
    }
}

/*

# Intuition
The intuition behind this solution is to count the number of times the sequence of numbers is not in ascending order. If this count is at most 1, it implies that the array can be rotated to become sorted.

# Approach
1. Initialize a variable `count` to track the number of times the sequence is not in ascending order.
2. Iterate through the array `nums`.
3. For each element, compare it with the next element in a circular manner (i.e., wrapping around to the beginning of the array when reaching the end).
4. If an element is greater than the next element, increment the `count`.
5. Finally, return whether the `count` is at most 1, indicating whether the array can be rotated to become sorted.

# Complexity
- Time complexity: O(n), where n is the number of elements in the array `nums`. We iterate through the array once.
- Space complexity: O(1), as we are using only a constant amount of extra space for variables.


*/