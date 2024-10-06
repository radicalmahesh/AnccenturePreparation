public class SumDivisor {
    public static int totaldivsornum(int n,int m){
        int sum=0;
        for (int i =n;i<=m;i++){
            if(i%3==0 && i%5==0  ){
                sum +=i;
            }
        }
        return  sum;
    }

    public static void main(String[] args) {
        int n =12;
        int m=50;
        System.out.println(totaldivsornum(n,m));
    }
}
