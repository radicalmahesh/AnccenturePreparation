public class DiffOddEven {
    public static double  oddEvenSum(int m,int n){
        int evenSum=0;
        int oddSum=0;
        for(int i=m;i<=n;i++){
            double sqre=Math.sqrt(i);
            if(i%2==0){
                evenSum +=sqre;
            }
            else{
                oddSum +=sqre;
            }
        }

            return evenSum-oddSum;
        }

    public static void main(String[] args) {
        int m=1;
        int n=10;
//        double rslt=oddEvenSum(double m,doz n);

        System.out.println(oddEvenSum(m,n));
    }

}
