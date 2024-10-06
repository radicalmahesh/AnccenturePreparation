public class TimeToBuytStock {
    public static  int maxProfit(int []prices){
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
             min=Math.min(min,prices[i]);
             max=Math.max(max,prices[i]-min);
        }
        return  max;




    }

    public static void main(String[] args) {
        int []prices={7,1,5,3,6,4,};
        System.out.println(maxProfit(prices));

    }
}
