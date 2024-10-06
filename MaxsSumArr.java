import java.util.Arrays;

public class MaxsSumArr {
    public static int MxDiffArr(int nums[]){
        Arrays.sort(nums);
        int diff=Integer.MIN_VALUE;  ///smallest possible value
        if(nums.length<2){
            return 0;

        }else{
            for(int i=1;i<nums.length;i++){
                diff=Math.max(diff,(nums[i]-nums[i-1]));

            }
        }
        return diff;
    }

    public static void main(String[] args) {
        int nums[]={3,6,9,1};
        System.out.println(MxDiffArr(nums));
    }
}
