package mocktest;

public class RemoveMirrorCharacters {

    public static void main(String[] args) {

        String s= "xyyx";
//        String s= "abcabc";
        if(s.length()%2!=0){
            System.out.println(s);
            return;
        }
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println(s);
                return;
            }
            i++;
            j--;
        }
        System.out.println(s.substring(0,s.length()/2));


    }
}
