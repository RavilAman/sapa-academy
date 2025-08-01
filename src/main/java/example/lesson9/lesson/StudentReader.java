package example.lesson9.lesson;

import example.lesson9.lesson.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Чтение файла построчно
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/lesson9/lesson/students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String[] nameParts = parts[0].split(" ");
                    if (nameParts.length == 2) {
                        String firstName = nameParts[0];
                        String lastName = nameParts[1];
                        double gpa = Double.parseDouble(parts[1]);
                        students.add(new Student(firstName, lastName, gpa));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        // Выводим результат
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
