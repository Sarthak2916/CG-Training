package CG_Engineers.M1Test;

public class MaxOccurringChar {

    public static void main(String[] args) {

        String s="abdcd";

        int fArr[]= new int[26];

        for(int i=0;i<s.length();i++){
            fArr[s.charAt(i)-'a']++;
        }
        int max=0,maxIndex=0;

        for(int i=0;i<fArr.length;i++){
            if(fArr[i]>max){
                max=fArr[i];
                maxIndex=i;
            }
        }

        System.out.println((char)(maxIndex+'a'));
    }
}
