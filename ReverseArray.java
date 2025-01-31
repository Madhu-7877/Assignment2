package practice;

import java.util.*;;

public class ReverseArray {
	
	/**
	 * Method to reverse an integer array in place
	 */
	public static void reverse(int[] arr) {
		
		/**
		 * Initialize two pointers: start at the beginning and end at the last element
		 */
		int start = 0, end = arr.length-1;
		
		/**
		 * 	Loop to swap elements until the pointers meet in the middle
		 */
        while (start < end) {
        	
            /**
             * Temporarily store the value at the start index
             */
            int temp = arr[start];

            /**
             * Assign the value at the end index to the start index
             */
            arr[start] = arr[end];

            /**
             * Assign the temporarily stored value to the end index
             */
            arr[end] = temp;

            /**
             * Move the start pointer forward
             */
            start++;

            /**
             *  Move the end pointer backward
             */
            end--;
        }
    }

    public static void main(String[] args) {
    	
        /**
         * Create an integer array to be reversed
         */
        int[] arr = {1, 2, 3, 4, 5};

        /**
         * Call the reverse method to reverse the array
         */
        reverse(arr);

        /**
         * Print the reversed array using Arrays.toString()
         */
        System.out.println("Reverse an Array: " + Arrays.toString(arr));
    }
}

// Time complexity : O(n)

// space complexity: O(1)