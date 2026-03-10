package CG_Engineers.M1Test;

public class PalindromeCount {

    static boolean checkPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {

        int count=0;
        String s="This is Palindrome level 101";

        for(String x: s.split(" ")){
            if(checkPalindrome(x)) count++;
        }

        System.out.println(count);
    }
}
