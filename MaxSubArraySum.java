package practice;

public class MaxSubArraySum {
    public static int maxSubArraySum(int[] arr) {
        int maxSum = arr[0];  // Stores the maximum sum found so far
        int currentSum = arr[0]; // Stores the current subarray sum

        for (int i = 1; i < arr.length; i++) {
            // Either extend the existing subarray or start a new one
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr)); // Output: 6 (subarray: [4, -1, 2, 1])
    }
}

//Time Complexity: O(n) (linear time, since it processes each element exactly once).
//Space Complexity: O(1)