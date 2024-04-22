/*
458. Max Consecutive Ones

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2
 
Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxm = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
            }
            maxm = Math.max(maxm, count);
        }
        return maxm;
    }
}


/*

# Intuition
The intuition behind this code is to count the maximum number of consecutive ones in an array of zeros and ones. We need to iterate through the array and keep track of the current sequence of ones, updating the maximum count as we go.

# Approach
1. **Initialize Counters**:
   - `count`: Keeps track of the current consecutive ones.
   - `maxm`: Stores the maximum consecutive ones found.

2. **Iterate through the Array**:
   - If the current element is `1`, increment `count`.
   - If the current element is `0`, reset `count` to zero (as the sequence of ones has been broken).

3. **Update the Maximum**:
   - After each iteration, update `maxm` with the maximum of `maxm` and `count`.

4. **Return the Maximum Count**:
   - After completing the iteration, return `maxm`, which represents the maximum number of consecutive ones in the array.

# Complexity
- **Time complexity**: O(n), where `n` is the length of the input array. The array is traversed once.
- **Space complexity**: O(1), as we're only using a constant amount of extra space for variables `count` and `maxm`.


*/