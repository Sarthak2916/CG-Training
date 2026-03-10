package CG_Engineers.M1Test;

public class CaesarCipher {

    public static void main(String[] args) {

        String s= "nrfzhxy";

        String res="";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a'>22){
                char c= (char)(s.charAt(i)+3-26);
                res+=c;
            } else{
                res+=(char)(s.charAt(i)+3);
            }
        }

        System.out.println(res);
    }
}
