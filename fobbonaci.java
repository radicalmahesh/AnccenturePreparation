public class fobbonaci {
    public static int fib(int n){
        if(n<=1){  //  base condition if n=0 or n=1 return n (0 or 1 according to n input)
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n=7;
        System.out.println(fib(n));
    }
}
