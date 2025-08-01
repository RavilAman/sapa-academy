package example.lesson9.lesson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleToFileExample {
    public static void main(String[] args) {
        // Создаем Scanner для чтения текста из консоли (System.in — поток ввода)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String input = scanner.nextLine(); // Считываем одну строку

        // Используем try-with-resources для автоматического закрытия потока
        try (
                // FileWriter открывает файл (создаст, если нет)
                FileWriter fileWriter = new FileWriter("src/main/resources/lesson9/lesson/output.txt");
                // BufferedWriter буферизует запись, ускоряя её
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write(input); // Записываем строку в файл
            bufferedWriter.newLine();    // Добавляем перенос строки
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            // Обработка ошибок при работе с файлами
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}
