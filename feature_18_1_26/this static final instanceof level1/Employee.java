package feature_18_1_26.this_static_final_instanceof_Operator_Level1;

class Employee {
    static String companyName = "TCS";
    private static int totalEmployees = 0;

    private String name;
    private final int id;
    private String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println();
    }
}
