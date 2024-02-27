import java.util.Scanner;
public class part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строк a и b
        System.out.print("Введите строку a: ");
        String a = scanner.nextLine();

        System.out.print("Введите строку b: ");
        String b = scanner.nextLine();

        // Сравнение строк и вывод результата
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}

