public class replaceChar {
    public static String Replacecharacter(String str1,char ch1,char ch2){
        char str[]=str1.toCharArray();
        String newstr1=" ";

        for(int i=0;i<str.length;i++){
            if(str[i]=='a'){
                newstr1+=ch2;

            }
            if(str[i]=='p'){
                newstr1+=ch1;
            }else{
                newstr1+=str[i];
            }
        }
        return newstr1;

    }

    public static void main(String[] args) {
        String str1="apples";
        char ch1='a';
        char ch2='p';
        System.out.println(Replacecharacter(str1,ch1,ch2));
    }
}
