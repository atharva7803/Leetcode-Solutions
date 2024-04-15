/*

15. Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, 
and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

Example 2:
Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.

Example 3:
Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 
Constraints:
3 <= nums.length <= 3000
-105 <= nums[i] <= 105

*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){ 

            if(i != 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }        
        }
        return ans;
    }
}


/*

Intuition:-

To solve the three-sum problem, we can use a two-pointer approach along with sorting the input array. 
By sorting the array, we can easily identify unique triplets without duplicates. 
The two-pointer approach helps us efficiently search for pairs that sum up to the target value.


Approach:-

1. Sort the input array nums.
2. Iterate through each element nums[i] in the array.
3. Inside the loop, use two pointers left and right to find pairs that sum up to -nums[i].
4. If the sum is less than 0, move the left pointer to the right to increase the sum.
5. If the sum is greater than 0, move the right pointer to the left to decrease the sum.
6. If the sum is 0, add the triplet (nums[i], nums[left], nums[right]) to the result list.
7. Increment left and decrement right, and skip duplicates.
8. Continue until left is less than right.
9. Skip duplicates of nums[i].
10. Return the list of unique triplets.


Complexity

Time complexity:- 
O(n2), where n is the number of elements in the input array nums. Sorting the array takes O(nlogn) time, 
and for each element, the two-pointer approach takes linear time.

Space complexity:- 
O(1), excluding the space required for the output list.

*/