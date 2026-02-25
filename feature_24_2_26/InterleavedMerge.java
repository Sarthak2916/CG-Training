package mocktest;

public class InterleavedMerge {

    public static void main(String[] args) {

        String s1= "abcd";
        String s2= "XYZ";
        String ans="";
        int i;
        for(i=0;i<s1.length() && i<s2.length();i++){
            ans+=s1.charAt(i);
            ans+=s2.charAt(i);
        }
        for(;i<s1.length();i++) ans+=s1.charAt(i);
        for(;i<s2.length();i++) ans+=s2.charAt(i);

        System.out.println(ans);
    }
}
