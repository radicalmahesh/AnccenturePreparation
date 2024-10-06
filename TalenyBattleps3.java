public class TalenyBattleps3 {
    public static int coutSpecificNumber(int m, int n) {
        if (m > n) {
            return -1;
        }
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (isNumberPresent(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isNumberPresent(int num) {
        String str = Integer.toString(num);
        for (char ch : str.toCharArray()) {
            if (ch != '1' && ch != '4' && ch != '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int m = 100;
        int n = 200;
        System.out.println(coutSpecificNumber(m, n)); // Should print the count of numbers between m and n containing only 1, 4, 9
    }
}
