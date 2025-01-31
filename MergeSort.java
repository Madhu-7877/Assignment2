package practice;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Avoids integer overflow

            // Recursively sort both halves
            mergeSort(arr, left, mid); 
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left, j = mid + 1, k = 0;
        int[] temp = new int[right - left + 1]; // Temporary array for merging

        // Merge both halves into temp[]
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
            	temp[k] = arr[i];
            	i++;
            	k++;
            } else {
            	temp[k] = arr[j];
                k++;
                j++;
            }
        }

        // Copy remaining elements from left half (if any)
        while (i <= mid) {
        	temp[k] = arr[i];
        	i++;
        	k++;
        }

        // Copy remaining elements from right half (if any)
        while (j <= right) {
        	temp[k] = arr[j];
        	j++;
        	k++;
        }

        // Copy sorted elements back into original array
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr)); // Output: [3, 9, 10, 27, 38, 43, 82]
    }
}

// Time complexity : O(nlogn)

// space complexity: O(1);

//where:
//
//a = 2 (two recursive calls)
//b = 2 (array is divided into two halves)
//d = 1 (merging takes O(n) time)

