public class Leapyear {
    public static boolean leapYr(int year){
        if(year%400==0){
            return true;
        }else if(year%4==0 && year%100!=0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year=400;
        boolean j=leapYr(year);
        if(j==true){
            System.out.println("it is leap year");
        }else {
            System.out.println("not a leap year");
        }
    }
}
