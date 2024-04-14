/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to 
target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {};
    }
}


/*

Intuition:-

The problem asks for finding two numbers in an array that sum up to a target value. An immediate approach could be 
to iterate through the array and for each element, check if there exists another element in the array that 
complements it to the target sum.


Approach:-

1. The twoSum function takes an array of integers nums and an integer target as input. 
2. It iterates through the array using two nested loops to check every possible pair of numbers. 
3. If a pair is found whose sum equals the target, it returns the indices of those numbers in an array. 
4. If no such pair is found, it returns an empty array.


Complexity

Time complexity:-
Let n be the number of elements in the array.
The function uses two nested loops to check every pair of elements, resulting in a time complexity of O(n2).

Space complexity:-
The space complexity is O(1) because the function only uses a constant amount of extra space, regardless of the
input size.

*/