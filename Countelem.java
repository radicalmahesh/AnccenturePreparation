import java.util.Scanner;
public class Countelem {
    public static  int countEle(int arr[],int ele){
       int count =0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==ele){
               count ++;
           }
       }



        return count;



    }

    public static void main(String[] args) {
        int []arr=new int[4];
        int ele=1;
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        int rslt=countEle(arr, ele);
        System.out.println(rslt);



    }
}
