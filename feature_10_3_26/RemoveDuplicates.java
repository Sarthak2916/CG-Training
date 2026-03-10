package CG_Engineers.M1Test;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s= "abdcdd";
        boolean arr[]= new boolean[26];

        for(int i=0;i<s.length();i++) arr[s.charAt(i)-'a']=true;

        String res="";

        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']){
                res+=s.charAt(i);
                arr[s.charAt(i)-'a']=false;
            }
        }

        System.out.println(res);
    }
}
