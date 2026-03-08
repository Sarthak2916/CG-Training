package CG_Engineers.M1Practice;

public class Ques3 {
    static int passwordChecker(String str){
        if(str.length()<4 || (str.charAt(0)>='0' && str.charAt(0)<='9')) return 0;
        boolean cflag=false,nflag=false;
        for(char c: str.toCharArray()){
            if(c>='A' && c<='Z') cflag=true;
            else if(c>='0' && c<='9') nflag=true;
            else if(c=='/' || c==' ') return 0;
        }
        if(cflag && nflag) return 1;
        return 0;
    }
    public static void main(String[] args) {

        String password= "Abc1234";
        int output= passwordChecker(password);
        System.out.println(output);
    }
}
