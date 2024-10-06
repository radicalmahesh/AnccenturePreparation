public class SumNPrimeNum{


//    sum of prime number
    public static int PrimeSum(int n){
        int sum=0;
        if(n<=0){
           return  0;
        }else {
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    sum+=i;   //sum=sum+i;
                }
            }

            return sum;
        }
    }

//    to check prime number
    public static boolean isPrime(int n){
        if(n<=1){
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

    public static void main(String[] args) {
        int n = 20;
        System.out.println(PrimeSum(n));

    }
}