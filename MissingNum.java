public class MissingNum {
        public static int MisssingNum(int arr[]){
            int n=arr.length;
            int total=n*(n+1)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i];
            }
            return total-sum;
        }

        public static void main(String[] args) {
            int []arr={3,0,1};
            System.out.println(MisssingNum(arr));

        }

}
