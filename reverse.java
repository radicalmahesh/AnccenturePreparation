import java.util.Arrays;
import java.util.Scanner;
public class reverse {

    public static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);

        start++;
        end--;
        }


        }
        public static  void swap(int arr[],int start,int end){
        int temp=arr[start];
        arr [start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter 4 elements in a array:");
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
