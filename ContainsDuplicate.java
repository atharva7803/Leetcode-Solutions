/*
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}


/*

# Intuition
The goal is to determine if there are any duplicate elements in an array. A simple and effective approach is to sort the array first, which allows for easy identification of duplicates, as any duplicates will be adjacent in the sorted array.

# Approach
1. **Sort the Array**: Sort the array using `Arrays.sort()`. This will bring any duplicate elements next to each other, allowing for quick identification.
2. **Check for Duplicates**:
   - Loop through the sorted array from the first to the penultimate element.
   - If an element is the same as the next element, it indicates a duplicate.
   - If a duplicate is found, return `true`.
3. **No Duplicates Found**:
   - If the loop completes without finding duplicates, return `false`.

# Time Complexity
- **Time complexity**: O(n log n), where `n` is the length of the array `nums`. This complexity arises from the sorting operation.
- **Space Complexity**
- **Space complexity**: O(1), as sorting is done in-place and the loop uses a constant amount of extra space for iteration.

*/

