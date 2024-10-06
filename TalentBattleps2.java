public class TalentBattleps2 {
    public static  int BalamceFruits(int a, int m,int rs) {
        if (a > m) {
            return (a - m) + rs;  //+ for sell
        }
        if(m>a){
            return (m-a)-rs;      // =for buy
        }

        return rs;
    }

    public static void main(String[] args) {
        int a=8;
        int m=4;
        int rs=12;
        System.out.println(BalamceFruits(a,m, rs));
    }
}
