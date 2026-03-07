package CG_Engineers.OtherQuestions;

public class ReplaceOccurrences {
    public static void main(String[] args) {

        String s="apples";
        char ch1='a', ch2='p';

        StringBuilder sb= new StringBuilder(s);

        for(int i=0;i<s.length();i++){
            if(sb.charAt(i)==ch1) sb.setCharAt(i,ch2);
            else if(sb.charAt(i)==ch2) sb.setCharAt(i,ch1);
        }
        System.out.println(sb);

    }
}
