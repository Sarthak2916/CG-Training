package mocktest;

public class RotationPalindrome {
    static boolean isPalindrome(char arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    static void rotate(char arr[]){
        char temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {

        String input="aab";
        char arr[]= input.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr)){
                System.out.println("True");
                return;
            }
            rotate(arr);
        }
        System.out.println("False");
    }
}
