package mocktest;
public class SelectiveReverse {
    public static void main(String[] args) {

        String s= "I love Java programming very much";
        String arr[]= s.split(" ");
        String ans="";
        int pos=1;
        for(int i=0;i<arr.length;i++){
            if(pos%2==0){
                for(int j=arr[i].length()-1;j>=0;j--){
                    ans+=arr[i].charAt(j);
                }
            } else {
                ans+=arr[i];
            }
            if(i!=arr.length-1) ans+=" ";
            pos++;
        }
        System.out.println(ans);
    }
}
