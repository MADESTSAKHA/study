import java.util.Scanner;

public class ScannerS {
    static void scannerS() {

        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";

        boolean corrction = false;
        String passCheck;
        String password;

        Scanner scan = new Scanner(System.in);

        while (!corrction) {
            System.out.print("Setup password: ");
            passCheck = scan.nextLine();
            while (true) {
                System.out.print("Enter password: ");
                password = scan.nextLine();
                if (password.equals(passCheck)) {
                    System.out.println(ANSI_GREEN + "Access is allowed!" + ANSI_RESET);
                    corrction = true;
                    scan.close();
                    break;
                }
                System.out.println(ANSI_RED + "\tAccess denied!" + ANSI_RESET);
            }
        }

/*        int secretPinCode = 7567;
        int pinCode = -1;

        while (pinCode != secretPinCode) {
            if (pinCode == -1) {
                System.out.println("Введите пин код:");
            } else {
                System.out.println("Пин введен неверно! Введите пин код:");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("Пин верен!");*/
    }
}