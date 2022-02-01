public class Main {
    public static void main(String[] args) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        for (int tickets = 200000; tickets <= 235000; tickets += 1000) {
            if (tickets <= 210000 || tickets >= 220000) {
                System.out.println(tickets);
            }
        }
        System.out.println(ANSI_PURPLE + "\n=============================\n" + ANSI_RESET);
        int ticket2 = 200000;
        while (ticket2 <= 350000) {
            if (ticket2 <= 210000 || ticket2 >= 220000) {
                if (ticket2 <= 210000) {
                    System.out.println(ANSI_GREEN + ticket2 + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + ticket2 + ANSI_RESET);
                }
            }
            ticket2 += 1000;
        }
    }
}