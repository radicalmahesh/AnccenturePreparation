import java.util.ArrayList;

public class Rotationarray {
    public static ArrayList<Integer> rotateArr(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        k = k % n;  // In case k is greater than n

        // Creating the rotated array
        ArrayList<Integer> rotatedArr = new ArrayList<>(n);

        // Add elements from the original array, rotated by k positions
        for (int i = 0; i < n; i++) {
            rotatedArr.add(arr.get((i + (n - k)) % n));
        }

        return rotatedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int k = 2;
        ArrayList<Integer> rotatedArr = rotateArr(arr, k);

        System.out.println("Original array: " + arr);
        System.out.println("Rotated array: " + rotatedArr);
    }
}
