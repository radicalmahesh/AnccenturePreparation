public class SLargeArr {
    public static int SecoondLarge(int arr[]){
        int lar=0;
        int Slar=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                Slar=lar;
                lar=arr[i];
            }else if(arr[i]<lar && arr[i]>Slar){ //As of we got  large and second large thats why between && opt

                Slar=arr[i];

            }
        }
        return Slar;
    }

    public static void main(String[] args) {
        int arr[]={5,2,4,1,2,};
        System.out.println(SecoondLarge(arr));
    }
}
