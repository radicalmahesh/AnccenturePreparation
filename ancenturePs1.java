import java.util.Scanner;

public class ancenturePs1 {

    public static int solve(int r, int unit, int arr[], int n) {
        if (arr == null) {
            return -1; // Return -1 if the array is null
        }

        int res = r * unit; // Calculate the target value
        int sum = 0; // Initialize sum to store the running total
        int count = 0; // Initialize count to store the number of elements added

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i]; // Add the current element to the sum
            count++; // Increment the count of elements used

            if (sum >= res) {
                break; // If the sum meets or exceeds the target, stop the loop
            }
        }

        if (sum < res) {
            return 0; // If the sum does not meet the target, return 0
        }

        return count; // Return the number of elements used
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Read the size of the array
        int unit = sc.nextInt(); // Read the unit value
        int r = sc.nextInt(); // Read the multiplier value
        int arr[] = new int[n]; // Declare the array of size n

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Populate the array with user input
        }

        System.out.println(solve(r, unit, arr, n)); // Call the solve function and print the result
    }
}
