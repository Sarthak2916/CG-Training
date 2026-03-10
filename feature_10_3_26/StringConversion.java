package CG_Engineers.M1Test;

public class StringConversion {

    public static void main(String[] args) {

        String s= "AbccDF";

        int uCount=0,lCount=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z') lCount++;
            else uCount++;
        }

        String res="";
        if(lCount>=uCount) res=s.toLowerCase();
        else res=s.toUpperCase();

        System.out.println(res);
    }
}
