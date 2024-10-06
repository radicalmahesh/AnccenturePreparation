import java.util.Scanner;

public class StringEqual {
    public static boolean checkStrings(String[] word1, String[] word2) {
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            string1.append(word1[i]);
        }
        for (int j = 0; j < word2.length; j++) {
            string2.append(word2[j]);
        }

        return string1.toString().equals(string2.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example input arrays
        String[] word1 = {"abc", "b", "bc"};
        String[] word2 = {"ab", "cb", "bc"};

        // Uncomment below lines if you want to take input from the user
        /*
        String[] word1 = new String[3];
        String[] word2 = new String[3];

        System.out.println("Enter 3 strings for the first array:");
        for (int a = 0; a < word1.length; a++) {
            word1[a] = sc.nextLine();
        }

        System.out.println("Enter 3 strings for the second array:");
        for (int b = 0; b < word2.length; b++) {
            word2[b] = sc.nextLine();
        }
        */

        System.out.println(checkStrings(word1, word2));
    }
}
