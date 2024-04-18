/*

66. PLUS ONE
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

Constraints:
1 <= digits.length <= 100
0 <= digits[i] <= 9
digits does not contain any leading 0's.

*/


class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;  //when last digit is 9,by adding 1=(10)        
        }

        int result[] = new int[n + 1];   //when 999 adding 1 to it
        result[0] = 1;   // making first digit to 1

        return result;
    }
}


/*

# Intuition
The intuition here is to increment the given integer represented by an array by one. We start from the least significant digit (the last element of the array) and increment it. If the digit becomes 10 after incrementing, we set it to 0 and continue the process with the next digit to the left. If we reach the leftmost digit and it becomes 10 after incrementing, we need to add an additional digit to the result.

# Approach
1. Iterate through the digits array from right to left.
2. If the current digit is less than 9, simply increment it by one and return the digits array.
3. If the current digit is 9, set it to 0 and continue to the next digit to the left.
4. If we reach the leftmost digit and it is 9, it means we need to add an additional digit to the result.
5. Create a new result array with length `n + 1`, where `n` is the length of the original digits array.
6. Set the first digit of the result array to 1 (since the original number was the maximum possible number, adding one will result in carrying over to the next digit).
7. Return the result array.

# Complexity
- Time complexity: O(n), where n is the length of the digits array. We iterate through the array once.
- Space complexity: O(n), if the result array needs to be expanded, where n is the length of the digits array. In the worst case, when all digits are 9, we need an additional digit in the result.

*/