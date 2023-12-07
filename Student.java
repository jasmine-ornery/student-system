// Student.java
import java.util.Date;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student(int studentId, String firstName, String lastName, Date birthDate) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Birthdate: " + birthDate.toString());
    }
}
