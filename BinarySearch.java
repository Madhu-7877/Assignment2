package practice;

public class BinarySearch {

    /**
     * Method to perform Binary Search on a sorted array
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2; // Avoids potential overflow
            
            if (arr[mid] == target) {
                return mid; // Target found, return its index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11}; // Sorted array
        int target = 7;
        System.out.println(binarySearch(arr, target));  // Output: 3
    }
}

// Time Complexity: O(log n).

// Space Complexity: O(1)
