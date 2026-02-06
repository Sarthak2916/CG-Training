package feature_6_2_26;

public class CustomExceptionEg {

    public static void main(String[] args) {

        try{

            int age=17;
            validateAge(age);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException();
        }
    }

}

class InvalidAgeException extends Exception{

    public InvalidAgeException(){
        super("Age must be 18 or above");
    }
}
