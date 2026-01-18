package feature_18_1_26.this_static_final_instanceof_Operator_Level1;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Sarthak", 1234567890L);
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }
        BankAccount.getTotalAccounts();

        Book b1 = new Book("Java Basics", "Herbert Schildt", "ISBN101");
        if (b1 instanceof Book) {
            Book.displayLibraryName();
            b1.displayDetails();
        }

        Employee e1 = new Employee("Aman", 101, "Developer");
        if (e1 instanceof Employee) {
            e1.displayDetails();
        }
        Employee.displayTotalEmployees();

        Product p1 = new Product("Laptop", 50000, 2, 501);
        if (p1 instanceof Product) {
            p1.displayDetails();
        }
        Product.updateDiscount(15);
        p1.displayDetails();

        Student s1 = new Student("Rohit", 12, 'A');
        if (s1 instanceof Student) {
            s1.displayDetails();
            s1.updateGrade('B');
            System.out.println("After Grade Update:");
            s1.displayDetails();
        }
        Student.displayTotalStudents();

        Vehicle v1 = new Vehicle("Neha", "Car", "DL09AB1234");
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }
        Vehicle.updateRegistrationFee(2500);
        v1.displayDetails();

        Patient pt1 = new Patient("Raj", 45, "Fever", 9001);
        if (pt1 instanceof Patient) {
            pt1.displayDetails();
        }
        Patient.getTotalPatients();
    }
}

