import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String middleName = scanner.next();
        String lastName = scanner.next();
        StringBuilder builder = new StringBuilder("ФИО сотрудника — ");
        builder.append(firstName)
                .append(" ")
                .append(middleName)
                .append(" ")
                .append(lastName);
        System.out.println(builder);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovic";
        StringBuilder builder = new StringBuilder("Данные ФИО сотрудника для заполнения отчета — ");
        builder.append(fullName.toUpperCase());
        System.out.println(builder);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace('ё', 'e'));
    }
}