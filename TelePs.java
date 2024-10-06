import java.util.Scanner;
import java.util.ArrayList;
public class TelePs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input size
            int n = scanner.nextInt();

            // Read the array elements
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Filter the array to remove negative elements
            ArrayList<Integer> filteredList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    filteredList.add(arr[i]);
                }
            }

//             Find the mid_index
            int filteredSize = filteredList.size();
            int midIndex = (filteredSize - 1) / 2;

            // Print the element at the mid_index
            System.out.println(filteredList.get(midIndex));

            // Close the scanner
            scanner.close();
        }
        }




