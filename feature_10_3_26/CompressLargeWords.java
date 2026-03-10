package CG_Engineers.M1Test;

public class CompressLargeWords {

    public static void main(String[] args) {

        String s= "The internationalization of localized Viltrumites is not good";

        String res="";

        for(String x: s.split(" ")){
            if(x.length()>10){
                res+=x.charAt(0);
                res+=x.length()-2;
                res+=x.charAt(x.length()-1);
            } else {
                res+=x;
            }
            res+=" ";
        }
        res.trim();
        System.out.println(res);
    }
}
