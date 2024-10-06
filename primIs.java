import  java.util.Scanner;
class primIs{

    public static boolean  isPrime(int n){
        if(n<=1){
            return  false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return  false;
            }
        }
        return  true;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner((System.in));
        System.out.print("Enter a any number:");
        int n=sc.nextInt();
       boolean c= isPrime(n);

        if(c==true){
            System.out.println(" Entered numbered " + n + " is Prime.");

        }else {
            System.out.println(" Entered numbered " + n + " is not  Prime.");
        }
    }
}