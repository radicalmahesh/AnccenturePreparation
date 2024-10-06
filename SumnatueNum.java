public class SumnatueNum {
    public static int getSum (int n){
        if(n==0){
            return n;


            }
        return n+getSum(n-1);
        }


    public static void main(String[] args) {
        int n=10;
        int r=getSum(n);
        System.out.println(r);
    }
}
