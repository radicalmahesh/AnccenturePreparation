public class Uppercase {
    public static String upperCase(char[] charArr) {
        boolean foundSpace = true;

        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLetter(charArr[i])) {
                if (foundSpace) {
                    charArr[i] = Character.toUpperCase(charArr[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }

        String result = String.valueOf(charArr);
        return result;
    }

    public static void main(String[] args) {
        char[] charArr = "hello world this is java".toCharArray();
        String result = upperCase(charArr);
        System.out.println(result); // Output: "Hello World This Is Java"
    }
}
