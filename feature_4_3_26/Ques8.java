package CG_Engineers.DSA;

public class Ques8 {

    public static void main(String[] args) {

        int []arr= {1,2,3,4};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int evenCount=0,oddCount=0;
                for(int k=i;k<=j;k++){
//                    System.out.print(arr[k]+" ");
                    if(arr[k]%2==0) evenCount++;
                    else oddCount++;
                }
                if(evenCount%2==0 && oddCount%2!=0) count++;
//                System.out.println();
            }
        }

        System.out.println(count);
    }
}
