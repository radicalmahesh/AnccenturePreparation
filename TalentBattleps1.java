public class TalentBattleps1 {
public static int GetBmiCategory(int weight,double height){

    double BMI= (weight/(height*height));
    if(BMI<18){
        return  0;
    }
    else if(BMI<=18 || BMI<25){
        return 1;
    }
    else if(BMI>=25 || BMI<30){
        return  2;
    }
    else if(BMI>=30 || BMI>35){
        return 3;
    }
    else{
        return 4;
    }


    }

    public static void main(String[] args) {
        int weight =42;
        double height=1.54;
        System.out.println(GetBmiCategory(weight,height));

    }
}
