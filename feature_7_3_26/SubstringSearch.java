package CG_Engineers.OtherQuestions;

public class SubstringSearch {
    public static void main(String[] args) {

        String s1= "Hello, World";
        String s2= "World";
        int i=0,j=0;
        int start=0;
        while(i<s1.length()){

            if(s1.charAt(i)==s2.charAt(j)){
                if(j==s2.length()-1) break;
                i++;
                j++;
            } else {
                i++;
                j=0;
                start=i;
            }
        }
        if(i>=s1.length()) System.out.println(-1);
        else System.out.println(start);
    }
}
