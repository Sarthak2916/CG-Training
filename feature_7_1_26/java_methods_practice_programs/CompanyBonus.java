package feature_7_1_26.java_methods_practice_programs;

public class CompanyBonus {
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000;
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] employeeData) {
        int employees = employeeData.length;
        double[][] updatedData = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            updatedData[i][0] = salary + bonus;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t\t%.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t\t%.2f%n", totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("---------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] updatedData = calculateBonus(employeeData);
        displaySummary(employeeData, updatedData);
    }
}
