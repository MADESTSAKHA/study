import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretPinCode = 7567;
        int pinCode = -1;

        Scanner scanner = new Scanner(System.in);
        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.print("Введите пароль: ");
            } else {
                System.out.print("Пароль введён неверно. Введите верный пароль: ");
            }
            pinCode = scanner.nextInt();
        }

        System.out.print("Пароль введён верно!!!");
    }
}
