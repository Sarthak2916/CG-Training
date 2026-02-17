package feature_17_2_26;

public class OCP_followed {

    public static void main(String[] args) {

        Persistence sqlDB= new SQLPersistence();
        Persistence mongoDB= new MongoDBPersistence();
        Persistence file= new FilePersistence();

        sqlDB.save();
        mongoDB.save();
        file.save();
    }
}

interface Persistence{

    void save();

}

class SQLPersistence implements Persistence{

    public void save(){
        System.out.println("saving to SQL Database...");
    }
}

class MongoDBPersistence implements Persistence{

    public void save(){
        System.out.println("saving to MongoDB Database...");
    }
}

class FilePersistence implements Persistence{

    public void save(){
        System.out.println("saving to File...");
    }
}
