public class ReverseString {
    public static String rvrs(String str){
            String rvestr="";
            for(int i=str.length()-1;i>=0;i--){
                rvestr +=str.charAt(i);

            }
        return  rvestr;
    }

    public static void main(String[] args) {
        String str="Mahesh";

        System.out.println( rvrs(str));
    }
}
