import java.util.Scanner;

public class hello {
    public static int counWords(String str){
        int len=0;
        String strx=str.trim();
        for(int i=0;i<strx.length();i++){
            if(strx==" "){
                return 0;
            }else{
                return len++;
            }
        }

        return  len;
    }
    public static void main(String args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("enter a String ");
        System.out.println(counWords(str));

    }

}
