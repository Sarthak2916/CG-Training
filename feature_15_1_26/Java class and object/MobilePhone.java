package feature_15_1_26.java_class_and_object;

public class MobilePhone {

    private String brand;
    private String model;
    private int price;

    MobilePhone(){
        brand="";
        model="";
        price=0;
    }
    MobilePhone(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    void mobilePhoneDetails(){
        System.out.println("Mobile Phone Brand: "+brand
        +"\nMobile Phone model: "+model
        +"\nMobile Phone price: "+price);
    }

}
