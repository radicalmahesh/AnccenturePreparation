//import java.util.Scanner;
//public class peakElem {
//    public static int PeakElem(int arr[]){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int mid=left+(right-left)/2;
//            if(arr[mid]>arr[mid+1]){
//                right=mid-1;  // serch only
//            }else{
//                left=mid+1;   //left become a right left or first half get ignored excliding mid
//            }
//        }
//        return left;
//    }
//    public static void main(String args[]){
//        int arr[]=new int[4];
//        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<4;i++){
//            arr[i]=sc.nextInt();
//        }
//
////        int arr[4]=sc.nextInt();
//    ;
//        int no=arr[    PeakElem(arr)];
//        System.out.println(no);
//
//
//    }
//}
import java.util.Scanner;
public class peakElem{
    public static int Peak(int []arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr =new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        int no=arr[Peak(arr)];
        System.out.println(no);
    }
}

