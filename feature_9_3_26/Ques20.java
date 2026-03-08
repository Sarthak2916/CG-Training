package CG_Engineers.M1Practice;

public class Ques20 {

    public static int findAutoCount(String n) {

        if (n == null)
            return 0;

        int count[] = new int[10];

        for (char c : n.toCharArray())
            count[c - '0']++;

        for (int i = 0; i < n.length(); i++) {

            int digit = n.charAt(i) - '0';

            if (count[i] != digit)
                return 0;
        }

        boolean visited[] = new boolean[10];
        int distinct = 0;

        for (char c : n.toCharArray()) {

            if (!visited[c - '0']) {
                visited[c - '0'] = true;
                distinct++;
            }
        }

        return distinct;
    }

    public static void main(String[] args) {

        System.out.println(findAutoCount("1210"));
    }
}