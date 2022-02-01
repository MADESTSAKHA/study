import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите сумму денег: ");
        Scanner scanner = new Scanner(System.in);
        int moneyAmount = scanner.nextInt();

        int cappucinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 80;

        if (moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить Капучино");
        }
        if (moneyAmount >= lattePrice) {
            System.out.println("Вы можете купить Латте");
        }
        if (moneyAmount >= espressoPrice) {
            System.out.println("Вы можете купить Экспрессо");
        }
        if (moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить Воду");
        }
    }
}