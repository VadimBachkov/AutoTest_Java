import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int action;
        do {
            System.out.println("Введите 1 для вывода пары года Осень, 2 - Зима, 3 - Весна, 4 - Лето, 5 для выхода из программы: ");
            action = sc.nextInt();

            switch (action) {
                case 1: {
                    System.out.println("Осень");
                    break;
                }
                case 2: {
                    System.out.println("Зима");
                    break;
                }
                case 3: {
                    System.out.println("Весна");
                    break;
                }
                case 4: {
                    System.out.println("Лето");
                    break;
                }
                case 5: {
                    System.out.println("Завершение работы...");
                    break;
                }
                default: {
                    System.out.println("Нет такой команды");
                }
            }
        } while (action != 5);
    }
}
