import java.util.Scanner;
public class pallindrom {
//    public static boolean plDrom(String str){
//        int left=0;
//        int right=str.length()-1;
//        while(left<right){
//            if(str.charAt(left)!=str.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return  true;
//    }
    public static boolean plDrom(String str){
        if(str  == null || str.length()==0 ){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<=str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start != end ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a any String :");
        String str=sc.nextLine();

        if( plDrom(str)==true){
            System.out.println("the given string is pallindrom");

        }else {
            System.out.println("given string is not a pallindrom");
        }

    }

}