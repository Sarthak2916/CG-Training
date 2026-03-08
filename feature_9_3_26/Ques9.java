package CG_Engineers.M1Practice;

public class Ques9 {

    public static String moveHyphen(String str) {

        if (str == null)
            return null;

        int count = 0;
        String result = "";

        for (char c : str.toCharArray()) {
            if (c == '-')
                count++;
            else
                result += c;
        }

        while (count-- > 0)
            result = "-" + result;

        return result;
    }

    public static void main(String[] args) {
        String str = "Move-Hyphens-to-Front";
        System.out.println(moveHyphen(str));
    }
}