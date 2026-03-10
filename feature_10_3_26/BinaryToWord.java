package CG_Engineers.M1Test;

public class BinaryToWord {

    static String wordConverter(String s){
        int count=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0' || i==s.length()-1){
                if(s.charAt(i)=='1') count++;
                res+=(char)('a'+count-1);
                count=0;
                continue;
            }
            count++;
        }
        return res;
    }
    public static void main(String[] args) {

        String s= "101101111111111110111";

        System.out.println(wordConverter(s));
    }
}
