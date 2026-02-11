package feature_10_2_26;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldExample {

    public static void main(String[] args) throws Exception {

        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);   // bypass private

        field.set(p, 30);             // modify value
        int value = (int) field.get(p);  // retrieve value

        System.out.println("Age: " + value);
    }
}

