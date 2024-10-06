import java.util.Arrays;
public class countStringNum {


        public static int countCHar(String str){
            String rmStr=str.trim();
            char [] ArmStr= rmStr.toCharArray(); // with this charArray
            int count=0;
            for (int i=0;i<ArmStr.length;i++){
                if(ArmStr[i] != ' '){
                    count++;
                }

            }
//               with this charArray
//        for(int i=0;i<rmStr.length();i++){
//            if(rmStr.charAt(i)!=' '){
//                count ++;
//            }
//        }
            return count;
        }

        public static void main(String[] args) {
            String str="Accenture Coding Round";
            System.out.println(countCHar(str));
        }

    }

