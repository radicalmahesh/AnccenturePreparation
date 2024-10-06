import java.util.*;

class Main {
    public static int operationsBinaryString(String str) {
        // Check for null input
        if (str == null)
            return -1;

        // Initialize the result with the first character converted to an integer
        int res = str.charAt(0) - '0';

        // Iterate over the string, starting from the second character
        for (int i = 1; i < str.length(); ) {
            char prev = str.charAt(i); // Get the operation character ('A', 'B', or 'C')
            i++; // Move to the next character, which should be a digit ('0' or '1')

            // Apply the operation based on the character
            if (prev == 'A')
                res = res & (str.charAt(i) - '0'); // AND operation
            else if (prev == 'B')
                res = res | (str.charAt(i) - '0'); // OR operation
            else
                res = res ^ (str.charAt(i) - '0'); // XOR operation

            i++; // Move to the next operation character
        }

        return res; // Return the final result after applying all operations
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        String str = sc.next(); // Read the input string
        System.out.println(operationsBinaryString(str)); // Print the result
    }
}
