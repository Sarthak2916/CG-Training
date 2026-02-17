package feature_17_2_26;

public class OCP_violated {

    public static void main(String[] args) {

        ShoppingCartStorage2 cartStorage= new ShoppingCartStorage2();

        cartStorage.saveToSQLDB();
        cartStorage.saveToMongoDB();
        cartStorage.saveToFile();

    }
}

class ShoppingCartStorage2{

    void saveToSQLDB(){
        System.out.println("saving to sql database...");
    }
    void saveToMongoDB(){
        System.out.println("saving to MongoDB");
    }
    void saveToFile(){
        System.out.println("saving to File...");
    }
}
