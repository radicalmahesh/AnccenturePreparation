//package prtc_ancenture ;

public class prtcA {
    public  static  void main(String[]args){
        int no= 987654;
        int rev=0;

        while(no!=0){
            int rem=no%10;
             rev=rev*10+rem;
//            System.out.println(rev);
            no/=10;
        }
        System.out.println( rev);


    }








}
