package CG_Engineers.DSA;

public class Ques24 {

    public static void main(String[] args) {

        int []arr= {7,1,3,4,6,2,4};
        int mine=Integer.MAX_VALUE,mino=Integer.MAX_VALUE;
        int maxe=Integer.MIN_VALUE,maxo=Integer.MIN_VALUE;

        for(int x: arr){
            if(x%2==0){
                mine=Math.min(mine,x);
                maxe=Math.max(maxe,x);
            } else {
                mino= Math.min(mino,x);
                maxo= Math.max(maxo,x);
            }
        }

        int countE=0,countO=0;
        for(int x: arr){
            if(x>=mine && x<=maxe) countE++;
            if(x>=mino && x<=maxo) countO++;
        }

        System.out.println(Math.max(countE, countO));
    }
}
