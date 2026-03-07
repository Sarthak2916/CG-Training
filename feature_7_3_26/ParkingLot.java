package CG_Engineers.OtherQuestions;

public class ParkingLot {

    static int parkingCars(String s){
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='S') count++;
        }
        return count;
    }
    public static void main(String[] args) {

        String parkingLot="XXXSXXSXXXSSXSSX";

        int result= parkingCars(parkingLot);
        System.out.println(result);
    }
}
