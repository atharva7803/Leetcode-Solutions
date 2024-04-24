/*
136. Single Number
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
 
Constraints:
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
          ans = ans ^ nums[i];
        }
        return ans;
    }
}

/*

# Intuition
Given an array of integers where every element appears twice except for one, the goal is to find the single number that appears only once. The key observation is that XORing two identical numbers results in zero, and XORing a number with zero results in the original number. Using this property, we can find the single unique number in an array.

Two important properties of XOR are the following:
XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a. ←Property 2
Here all the numbers except the single number appear twice and so will form a pair. Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will be = 0 ^ (single number) = single number (according to property 2).
So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.


# Approach
We will just perform the XOR of all elements of the array using a loop and the final XOR will be the answer.
Dry run:

Assume the given array is: [4,1,2,1,2]
XOR of all elements = 4^1^2^1^2
= 4 ^ (1^1) ^ (2^2)
= 4 ^ 0 ^ 0 = 4^0 = 4
Hence, 4 is the single element in the array.

# Complexity
- **Time complexity**: O(n), where `n` is the number of elements in the array. This is because each element is processed once in the loop.
- **Space complexity**: O(1), as the code uses only a single extra variable `ans` for the XOR operation.
*/