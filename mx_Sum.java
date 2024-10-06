public class mx_Sum {
    public static void main(String[] args) {

        int []num={-2,1,-3,4,-1,2,1,-5,4};
        int max_sum=0;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<num.length;i++){
            max_sum += num[i];
            max=Math.max(max,max_sum);
            if(max_sum<0){
                max_sum=0;
            }
            System.out.println(max_sum);

        }


    }
}
