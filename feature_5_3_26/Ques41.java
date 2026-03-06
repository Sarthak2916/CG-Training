package CG_Engineers.DSA;

public class Ques41 {

    public static void main(String[] args) {

        Bank p= new PersonalLoanDept();
        Bank b= new BusinessLoanDept();
    }
}

interface Bank{

    void message();
    void averageLoan(long loan);
}

class PersonalLoanDept implements Bank{

    PersonalLoanDept(){
        message();
        long loan=1000000000000000L;
        averageLoan((int)1000000000000000000L);
    }
    int minLoan=10000;
    int maxLoan=1000000;
    public void message(){
        System.out.println("Personal Loan Approved.");
    }
    public void averageLoan(long loan){
        System.out.println((minLoan+maxLoan)/2);
        System.out.println("long loan "+loan);
    }
    public void averageLoan(int loan){
        System.out.println((minLoan+maxLoan)/2);
        System.out.println("int loan "+loan);
    }

}

class BusinessLoanDept implements Bank{

    BusinessLoanDept(){
        message();
//        averageLoan();
    }
    int minLoan=100000;
    int maxLoan=1000000000;
    public void message(){
        System.out.println("Business Loan Approved.");
    }
    public void averageLoan(long loan){
        System.out.println((minLoan+maxLoan)/2);
    }
}
