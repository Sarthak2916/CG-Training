package CG_Engineers.M1Practice;

public class Ques2 {

    static int operationsBinaryString(String str){

        int ans=str.charAt(0),i=1;
        while(i<str.length()){
            char operand= str.charAt(i);
            i++;
            int val= str.charAt(i)-'0';
            if(operand=='A') ans=ans&val;
            else if(operand=='B') ans=ans|val;
            else ans=ans^val;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {

        String str= "1C0C1C1A0B1";
        int i='0'-'0';
        System.out.println(i);
        int result= operationsBinaryString(str);
        System.out.println(result);
        System.out.println(operationsBinaryString("0C1A1B1C1C1B0A0"));
    }
}
