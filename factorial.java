public class factorial {
    public static int fact(int n){
        int result =1;       // base condition n=1 or n=0 return 1
        for (int i=1;i<=n;i++){
            result *=i;

        }
        return result;
    }

    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }

}
