package practice;
import java.util.Arrays;

public class CoinChange {
    
    public static int coinChange(int[] coins, int amount) {
        // Create a DP array to store minimum coins required for each amount from 0 to amount
        int[] dp = new int[amount + 1];
        
        // Initialize dp array with a large value (amount + 1 is effectively infinite)
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Iterate through all amounts from 1 to 'amount'
        for (int i = 1; i <= amount; i++) {
            // Try every coin denomination
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If we were unable to make the amount, return -1
        return (dp[amount]);
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        
        System.out.println(coinChange(coins, amount)); // Output: 3 (5 + 5 + 1)
    }
}

//Total Time Complexity: O(N * M)

//Space Complexity: O(N)
