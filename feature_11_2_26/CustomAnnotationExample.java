package feature_10_2_26;

import java.lang.reflect.Method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    int priority();
    String assignedTo();
}


public class CustomAnnotationExample {

    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        Method method = manager.getClass().getMethod("completeTask");

        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }
}

class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Sarthak")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

