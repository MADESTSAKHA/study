import java.util.Scanner;

public class Timur {
    static void timur() {
        String ANSI_RESET = "\u001B[0m";

        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_BLUE = "\u001B[34m";

        Scanner scanner = new Scanner(System.in);

        String isEmpty = "";

        while (isEmpty.isEmpty()) {

            String[] worldListOne = {"Тимур", "Вова", "Катя", "Амелия", "Георгий", "Оливия", "Альберт", "Лена", "Наталья"};
            String[] worldListTwo = {"любит", "ест", "убивает", "догоняет", "доробатывает", "доедает", "влетает в", "высасывает", "надувает", "прокалывает", "нюхает"};
            String[] worldListThree = {"человека", "свинью", "глисту", "мертвую кошку", "змею", "лягушку", "чашку", "попу", "старичка", "пук", "дом"};
            int oneLength = worldListOne.length;
            int TwoLength = worldListTwo.length;
            int ThreeLength = worldListThree.length;
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * TwoLength);
            int rand3 = (int) (Math.random() * ThreeLength);

            String phrase = ANSI_RED + worldListOne[rand1] + ANSI_GREEN + " " + worldListTwo[rand2] + " " + ANSI_BLUE + worldListThree[rand3];
            System.out.println(phrase);
            System.out.print(ANSI_RED + "\t\t\tНажмите ENTER " + ANSI_RESET);
            isEmpty = scanner.nextLine();
        }
        System.out.println("Вы все вонючки!!! Зря вы написали: " + isEmpty);
    }
}