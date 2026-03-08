package CG_Engineers.M1Practice;

public class Ques11 {

    public static String replaceCharacter(String str, char ch1, char ch2) {

        if (str == null)
            return null;

        if (ch1 == ch2)
            return str;

        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ch1)
                arr[i] = ch2;

            else if (arr[i] == ch2)
                arr[i] = ch1;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacter("apples", 'a', 'p'));
    }
}