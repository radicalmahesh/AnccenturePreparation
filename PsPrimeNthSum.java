public class PsPrimeNthSum {
    public static int PrimeSum(int n){
        int sum=0;
        if(n<=1){
            return 0;
        }else{
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    sum+=i;
                }
            }
        }
        return  sum;
    }
    public static boolean isPrime(int n){
        if (n <= 1) {

            return  false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;


    }
    public static void main(String args[]){
        int n=10;
        System.out.println(PrimeSum(n));
    }
}
