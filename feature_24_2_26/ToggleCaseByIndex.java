package mocktest;

public class ToggleCaseByIndex {

    public static void main(String[] args) {

        String s="java programming";
        String ans="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(count%2==0){
                String temp=""+s.charAt(i);
                ans+=temp.toUpperCase();
            } else {
                String temp=""+s.charAt(i);
                ans+=temp.toLowerCase();
            }
            if(s.charAt(i)!=' ') count++;
        }
        System.out.println(ans);
    }
}
