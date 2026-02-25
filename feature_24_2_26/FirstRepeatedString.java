package mocktest;

public class FirstRepeatedString {

    public static void main(String[] args) {

        String[] arr= {"java","python","c++","java","c","python"};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i].equals(arr[j])){
                        System.out.println(arr[i]);
                        return;
                    }
                }
            }
        }
    }
}
