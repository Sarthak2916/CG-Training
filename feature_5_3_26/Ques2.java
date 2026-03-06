package CG_Engineers.ObjectModeling;

import CG_Engineers.DSA.Ques16;

public class Ques2 extends Ques16{

    public static void main(String[] args) {
        check();
        Ques2 q= new Ques2();
        q.check();
        Multiplier multiplier= new Multiplier();
        int result= multiplier.multipy(6,10);
        System.out.println(result);
    }
}

abstract class Calculator{
    public abstract int add(int a, int b);
}

class Adder extends Calculator{

    public int add(int a, int b){
        return a+b;
    }
}

class Multiplier{
    int result;
    int multipy(int a, int b){

        Adder adder= new Adder();
        for(int i=1;i<=b;i++) result= adder.add(a,result);
        return result;
    }
}
