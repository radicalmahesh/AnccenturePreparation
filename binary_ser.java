import java.util.Scanner;

public class binary_ser {
    public static  void targetElem(int arr[],int targ){
        int LA=0;
        int RA=( arr.length-1);


        while(LA<=RA){
            int Mid=LA+(RA-LA)/2;

            if (arr[Mid]==targ) {



                System.out.println("Target element " + targ +  " is present at  "+Mid);
//                return Mid;

            }
            if(arr[Mid]<targ){
                LA=Mid+1;
            }else {
                RA=Mid-1;
            }

        }



//        return 0;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter a elem in array");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter a target elm:");
        int targ= sc.nextInt();

          targetElem(arr,targ);


    }
}
