import java.util.Arrays;

import java.util.Scanner;

public class Anagram {

    public static boolean anlArm(char[]str1,char []str2){
        int n1=str1.length;
        int n2=str2.length;
        if(n1!=n2){
            return false;

        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i =0;i<n1;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
            else{
                return true;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a String :");
        char [] str1= ("mahesh").toCharArray();
//        char [] str1=sc.nextLine();
//        System.out.println("Enter a Another String");
        char [] str2=("shahem").toCharArray();
        anlArm(str1,str2);
        if(  anlArm(str1,str2)==true){
            System.out.println("the "+ str1 +"is amalgam of"+str2 );
        }else{
            System.out.println("NO");
        }
    }
}
