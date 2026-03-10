package CG_Engineers.M1Test;

public class RepeatString {

    static String repeat(int N, String S){
        String ans="";
        for(int i=0;i<N;i++){
            ans=ans+S;
        }
        return ans;
    }
    public static void main(String[] args) {

        int N=5;
        String S="Hell";
        System.out.println(repeat(N,S));
    }
}
