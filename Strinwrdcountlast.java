public class Strinwrdcountlast {
    public static int couLastwrd(String str){
        char[] strc=str.toCharArray();
        int wrdcont=0;
        char isSpacefound=' ';
        for(int i=0;i<strc.length;i++){
            if(strc[i]!=' '){
                wrdcont++;
            }else{
                wrdcont=0;
            }
        }
        return wrdcont;
    }

    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(couLastwrd(str));
    }
}

