public class largeElm {
    public static void main(String[] args) {

        int []arr={ 2,5,6,6,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
//            System.out.println(max);
        }
        System.out.println(max);
    }
}
