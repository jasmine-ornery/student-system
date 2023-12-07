// MainProgram.java
import java.util.Date;

public class MainProgram {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John", "Doe", new Date(2000, 5, 15));
        Student student2 = new Student(2, "Jane", "Smith", new Date(1999, 8, 22));

        Course course = new Course(101, "Computer Science 101");
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        System.out.println("Course Information:");
        course.displayCourseInfo();
    }
}
