/*

189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:
1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public static void reverse(int nums[], int s, int e){
        while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }
    }
}


/*

# Intuition
The goal of this code is to rotate the elements of an array by a given number of positions to the right. 
To achieve this efficiently, we can use a combination of array reversing techniques.


# Approach
1. **Calculate the Effective Rotation**: Given that rotating an array `n` times is equivalent to no rotation (because it loops back to the original order), the effective rotation `k` should be computed by taking the modulo of `k` with the length of the array: `k = k % n`.

2. **Reverse the Entire Array**: Reverse the entire array, so the elements that were at the end are now at the beginning. This brings the elements that need to be moved to the front.

3. **Reverse the First `k` Elements**: Reverse the first `k` elements of the array. This restores the order for those elements that were moved from the end.

4. **Reverse the Rest of the Array**: Reverse the elements from index `k` to the end. This brings the remaining elements back to their correct positions, completing the rotation.

Using this approach, we achieve the desired rotation without needing additional arrays or complex logic.


# Complexity
- **Time complexity**: O(n), where `n` is the length of the array. We reverse the array a total of three times, which takes linear time.
- **Space complexity**: O(1), as the reversal operations are done in-place, requiring only constant space for temporary variables.

*/