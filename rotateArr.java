import java.util.Arrays;

public class rotateArr {
    public static int[] arrRotaion(int []arr,int n,int d){
        int temp[]=new int[n];
        int index=0;
        for(int i=d;i<n;i++){
            temp[index]=arr[i];
            index++;
        }
        for (int i=0;i<d;i++){
            temp[index]=arr[i];
            index++;
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={2,5,1,3,7,6};
        int n=6;
        int d=2;
        System.out.println();
        int[] rotatedArr = arrRotaion(arr, n, d);
        System.out.println(Arrays.toString(rotatedArr));
    }
}
