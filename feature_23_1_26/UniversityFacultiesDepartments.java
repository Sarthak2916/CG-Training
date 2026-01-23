package feature_23_1_26;

import java.util.ArrayList;

class Faculty {
    private int facultyId;
    private String facultyName;

    public Faculty(int facultyId, String facultyName) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void displayFaculty() {
        System.out.println("Faculty ID: " + facultyId + " | Name: " + facultyName);
    }
}

class Department {
    private String deptId;
    private String deptName;
    private ArrayList<Faculty> facultyList;

    public Department(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.facultyList = new ArrayList<>();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addFaculty(Faculty faculty) {
        if (faculty != null && !facultyList.contains(faculty)) {
            facultyList.add(faculty);
        }
    }

    public void displayDepartment() {
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
        System.out.println("Faculty Members:");
        if (facultyList.isEmpty()) {
            System.out.println("No faculty assigned");
        } else {
            for (Faculty f : facultyList) {
                f.displayFaculty();
            }
        }
        System.out.println("----------------------------------");
    }
}

class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> facultyPool;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.facultyPool = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(String deptId, String deptName) {
        departments.add(new Department(deptId, deptName));
    }

    public void addFacultyToPool(Faculty faculty) {
        if (faculty != null && !facultyPool.contains(faculty)) {
            facultyPool.add(faculty);
        }
    }

    public Department getDepartmentById(String deptId) {
        for (Department d : departments) {
            if (d.getDeptId().equals(deptId)) {
                return d;
            }
        }
        return null;
    }

    public void assignFacultyToDepartment(String deptId, Faculty faculty) {
        Department dept = getDepartmentById(deptId);
        if (dept != null && faculty != null) {
            dept.addFaculty(faculty);
            addFacultyToPool(faculty);
        }
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        if (departments.isEmpty()) {
            System.out.println("No departments created");
        } else {
            for (Department d : departments) {
                d.displayDepartment();
            }
        }

        System.out.println("Faculty Pool (Independent):");
        if (facultyPool.isEmpty()) {
            System.out.println("No faculty available");
        } else {
            for (Faculty f : facultyPool) {
                f.displayFaculty();
            }
        }

        System.out.println("==================================");
    }

    public void deleteUniversity() {
        departments.clear();
        universityName = null;
    }
}

public class UniversityFacultiesDepartments {
    public static void main(String[] args) {
        Faculty f1 = new Faculty(101, "Dr. Sharma");
        Faculty f2 = new Faculty(102, "Dr. Mehta");
        Faculty f3 = new Faculty(103, "Dr. Khan");

        University u1 = new University("ABC University");

        u1.addDepartment("CSE", "Computer Science");
        u1.addDepartment("ECE", "Electronics");

        u1.assignFacultyToDepartment("CSE", f1);
        u1.assignFacultyToDepartment("CSE", f2);

        u1.addFacultyToPool(f3);

        System.out.println("Before Deleting University:");
        u1.displayUniversity();

        System.out.println("Faculty exists independently:");
        f3.displayFaculty();
        System.out.println("----------------------------------");

        u1.deleteUniversity();

        System.out.println("After Deleting University:");
        u1.displayUniversity();

        System.out.println("Faculty still exists independently:");
        f1.displayFaculty();
        f2.displayFaculty();
        f3.displayFaculty();
    }
}
