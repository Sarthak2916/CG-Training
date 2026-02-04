package feature_5_2_26;

import java.util.ArrayList;
import java.util.List;


abstract class CourseType {

    private String evaluationMethod;

    public CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract String getTypeDetails();
}


class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Exam Based");
    }

    public String getTypeDetails() {
        return "Final Written Examination";
    }
}

class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignment Based");
    }

    public String getTypeDetails() {
        return "Multiple Assignments & Projects";
    }
}

class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Based");
    }

    public String getTypeDetails() {
        return "Thesis & Research Paper";
    }
}


class Course<T extends CourseType> {

    private String courseName;
    private String department;
    private T courseType;

    public Course(String courseName, String department, T courseType) {
        this.courseName = courseName;
        this.department = department;
        this.courseType = courseType;
    }

    public String getDetails() {
        return courseName + " | " +
                department + " | " +
                courseType.getEvaluationMethod() +
                " (" + courseType.getTypeDetails() + ")";
    }
}


class CourseCatalog {

    private List<Course<? extends CourseType>> courses =
            new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {

        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getDetails());
        }
    }
}


public class UniversityCourseSystem {

    public static void main(String[] args) {

        Course<ExamCourse> java =
                new Course<>("Java Programming", "Computer Science",
                        new ExamCourse());

        Course<AssignmentCourse> design =
                new Course<>("UI/UX Design", "Design Department",
                        new AssignmentCourse());

        Course<ResearchCourse> ai =
                new Course<>("AI Research", "Artificial Intelligence",
                        new ResearchCourse());

        CourseCatalog catalog = new CourseCatalog();

        catalog.addCourse(java);
        catalog.addCourse(design);
        catalog.addCourse(ai);

        catalog.displayCourses();
    }
}

