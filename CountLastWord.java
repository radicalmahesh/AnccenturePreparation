import java.util.Scanner;

public class CountLastWord {
    public static int countWords(String str) {
        String strx = str.trim();  // Remove leading and trailing spaces
        int len = 0;

        // Iterate from the end of the string to the beginning
        for (int i = strx.length() - 1; i >= 0; i--) {
            if (strx.charAt(i) == ' ') {
                break;  // Stop when we encounter the first space
            } else {
                len++;
            }
        }

        return len;  // Return the length of the last word
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Length of the last word: " + countWords(str));
    }
}
