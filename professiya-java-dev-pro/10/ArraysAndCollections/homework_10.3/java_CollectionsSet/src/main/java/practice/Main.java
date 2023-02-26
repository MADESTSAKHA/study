package practice;

import java.util.Scanner;

public class Main {
    static String ANSI_RESET = "\u001B[0m";
    static String ANSI_RED = "\u001B[31m";
    static String ANSI_GREEN = "\u001B[32m";
    static String ANSI_PURPLE = "\u001B[35m";
    public static final String WRONG_EMAIL_ANSWER = ANSI_RED + "\n\t\tНеверный формат email" + ANSI_RESET;
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */
    private static String[] input;
    static EmailList emailList = new EmailList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nКоманды которые Вы можете использовать: " + ANSI_GREEN + "LIST, ADD" + ANSI_RESET);
            System.out.print(ANSI_GREEN + "Введите команду: " + ANSI_RESET);

            input = scanner.nextLine().split("\\s+");

            StringBuilder builder = new StringBuilder();
            for (int i = 2; i < input.length; i++) {
                builder.append(input[i]).append(" ");
            }

            switch (input[0].toUpperCase()) {
                case "LIST":
                    viewToDoList();
                    break;
                case "ADD":
                    addMailList();
                    break;
                default:
                    if (!input[0].isEmpty()) {                                                     //Проверка на пустоту
                        System.out.println(ANSI_RED + "\n\tТакой команды нет" + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_RED + "\n\tВы ничего не ввели!" + ANSI_RESET);
                    }
            }
        }
    }

    private static void addMailList() {
        if (input.length <= 1) {
            System.out.println("\n\tПосле " + ANSI_RED + "ADD" + ANSI_RESET + ", через пробел введите "
                    + ANSI_PURPLE + "email." + ANSI_RESET);
        } else {
            emailList.add(input[1]);
        }
    }

    private static void viewToDoList() {
        if (emailList.getSortedEmails().isEmpty()) {
            System.out.println(ANSI_RED + "\n\tСписок пуст!" + ANSI_RESET);
        } else {
            for (String value : emailList.getSortedEmails()) {
                System.out.println("\t\t" + value);
            }
        }
    }
}