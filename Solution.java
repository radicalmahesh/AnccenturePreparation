class Solution{

public static int secondLarge(int arr[]){
    int large=0;
    int secLar=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]> large){
            secLar=large;
            large=arr[i];

        }if(arr[i]<large &&  arr[i]>secLar){
            secLar=arr[i];
        }
    }
    return secLar;
}


    public static void main (String args[]){
    int[] arr={2,4,3,5,6};
    int findslar=secondLarge(arr);
    System.out.println(findslar);


    }
}