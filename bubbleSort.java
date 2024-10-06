import java.util.Scanner;

public class bubbleSort {

    // Method to perform bubble sort on an array
    public static void Bblsrt(int arr[]) {
        int n = arr.length;

        // Outer loop: Iterate over the entire array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: Compare adjacent elements
            // The '- i' ensures that the largest elements are moved to the end of the array,
            // reducing the number of comparisons needed
            for (int j = 0; j < n - i - 1; j++) {
                // If the current element is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 6, 2};  // Initialize an array

        Bblsrt(arr);  // Call the bubble sort method

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


