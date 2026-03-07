package CG_Engineers.OtherQuestions;

public class StringTransformation {

    public static void main(String[] args) {

        String s="aaabbcca";

        StringBuilder sb= new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)=='a') sb.setCharAt(i,'b');
            else if(sb.charAt(i)=='b') sb.setCharAt(i,'a');
        }
        System.out.println(sb);
    }
}
