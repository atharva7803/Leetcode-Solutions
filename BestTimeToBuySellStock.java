/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 
Constraints:
1 <= prices.length <= 105
0 <= prices[i] <= 104
*/

class Solution {
    public int maxProfit(int[] prices) {
        int BP = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(BP < prices[i]){
                int profit = prices[i] - BP;
                maxProfit = Math.max(profit, maxProfit);
            }
            else{
                BP = prices[i];
            }
        }
        return maxProfit;
    }
}


/*

# Intuition:
To find the maximum profit from buying and selling stock, we need to buy low and sell high. This code aims to identify the maximum difference between buying and selling prices, where the buying price is earlier than the selling price in the given array.

# Approach:
- Initialize `BP` (Best Price) to `Integer.MAX_VALUE`, which is a large value. This will be used to keep track of the lowest price seen so far.
- Initialize `maxProfit` to `0`, representing the maximum profit found.
- Iterate through the array of stock prices.
  - If the current price is greater than `BP`, it means selling at this price yields a profit. Calculate this profit and update `maxProfit` if it's greater than the current `maxProfit`.
  - If the current price is less than `BP`, update `BP` to this new lower price, indicating that this would be the best day to buy.
- Return `maxProfit` after the loop completes. This value represents the maximum profit possible with one buy and one sell operation.

# Complexity:
- **Time complexity**: O(n), where `n` is the number of elements in the `prices` array. This is because we only loop through the array once.
- **Space complexity**: O(1), as we're only using a constant amount of extra space for a few variables.

*/