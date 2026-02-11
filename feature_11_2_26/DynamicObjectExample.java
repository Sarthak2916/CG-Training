package feature_10_2_26;

class Student {

    public Student() {
        System.out.println("Student object created");
    }

    public void show() {
        System.out.println("Hello from Student class");
    }
}

public class DynamicObjectExample {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");

        Object obj = cls.getDeclaredConstructor().newInstance();

        Student s = (Student) obj;
        s.show();
    }
}

