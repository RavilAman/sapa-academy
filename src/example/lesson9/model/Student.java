package example.lesson9.model;

public class Student {
    String firstName;
    String lastName;
    Double gpa;

    public Student(String firstName, String lastName, Double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
