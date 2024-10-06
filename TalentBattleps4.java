public class TalentBattleps4 {
    public static int CountDigitOccurance(int l, int u, int x) {
        if (l > u) {
            return -1;
        }
        int count = 0;
        for (int i = l; i <= u; i++) {
            if (isDigitPresent(i, x)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isDigitPresent(int num, int x) {
        String str = Integer.toString(num);
        char target = Integer.toString(x).charAt(0);
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int l = 2;
        int u = 13;
        int x = 3;
        System.out.println(CountDigitOccurance(l, u, x)); // Should print the count of numbers between l and u containing the digit x
    }
}
