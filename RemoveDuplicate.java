/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
*/


class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return (i+1);
    }
};



/*

Intuition
The problem seems to require removing duplicates from a sorted array. One way to do this efficiently is by iterating through the array and maintaining two pointers, one for the current unique element and one for iterating through the array.

Approach
1. Initialize two pointers, i and j, where i points to the beginning of the array and j iterates through the array.
2. Iterate through the array starting from index 1 (as the first element is always considered unique).
3. If nums[j] is different from nums[i], update nums[i+1] with nums[j] and increment i.
4. Repeat steps 2-3 until j reaches the end of the array.
5. Return i+1, which represents the length of the new array with duplicates removed.

Complexity

Time complexity: O(n)
Space complexity: O(1)

*/