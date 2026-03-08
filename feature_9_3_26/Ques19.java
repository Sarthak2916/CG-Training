package CG_Engineers.M1Practice;

public class Ques19 {

    public static void maxInArray(int arr[]) {

        int max = arr[0];
        int index = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }

    public static void main(String[] args) {

        int arr[] = {23,45,82,27,66,12,78,13,71,86};

        maxInArray(arr);
    }
}