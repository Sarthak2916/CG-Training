package feature_18_1_26.this_static_final_instanceof_Operator_Level1;

class Student {
    static String universityName = "Delhi University";
    private static int totalStudents = 0;

    private String name;
    private final int rollNumber;
    private char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void updateGrade(char newGrade) {
        this.grade = newGrade;
    }

    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

