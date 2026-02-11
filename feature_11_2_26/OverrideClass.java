package feature_10_2_26;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class OverrideClass{

    public static void main(String[] args) {

        Dog d = new Dog();
        d.makeSound();
    }

}
