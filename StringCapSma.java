public class StringCapSma {
    public static String changCase(String str){
        String cC=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                cC+=Character.toUpperCase(ch);

            }else{
                cC+=Character.toLowerCase(ch);
            }
        }
        return cC;

    }

    public static void main(String[] args) {
        String str="MaHesH";
        System.out.println(changCase(str));
    }
}
