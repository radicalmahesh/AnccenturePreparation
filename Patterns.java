public class Patterns{
//1
//    public static boolean Pattern(int n){
//        int count =1;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print( count++ +"  ");
//            }
//            System.out.println("");
//        }
//        return false;
//    }

//    2
//public static boolean Pattern(int n){
//        int count =1;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print( "* ");
//            }
//            System.out.println("");
//        }
//        return false;
//    }

//    3
//    public static boolean Pattern(int n){
//        for (int i=0;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print( " *");
//            }
//            System.out.println("");
//        }
//        return false;
//    }


//    4
public static boolean Pattern(int n){
    for (int i=0;i<=n;i++){
            if(i<=n){
            for(int j=0;j<i;j++) {
                System.out.print("* ");
            }


        }

        System.out.println("");
    }
    return false;
}


    public static void main(String args[]){
        int n=5;
        System.out.println(Pattern(n));
    }
}

















