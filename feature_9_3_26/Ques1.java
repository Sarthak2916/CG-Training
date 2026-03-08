package CG_Engineers.M1Practice;

public class Ques1 {
    public static void main(String[] args) {

        int houses[]= {5,4,8,1,12,2,4};
        int rats=6;
        int units=3;

        int totalFoodRequired=rats*units;
        int i;

        for(i=0;i<houses.length;i++){
            if(totalFoodRequired<=0) break;
            totalFoodRequired-=houses[i];
        }

        System.out.println(i);
    }
}
