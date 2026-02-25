package mocktest;

public class CharacterFrequencyCompression {

    public static void main(String[] args) {

        String s="aaabbcddd";
        String ans="";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans+=s.charAt(i);
                ans+=count;
                count=1;
            } else {
                count++;
            }
        }
        ans+=s.charAt(s.length()-1);
        ans+=count;
        System.out.println(ans);
    }
}
