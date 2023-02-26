public class PrintEvenNumbers {
    //Вывод переменной
    static void printEvenNumbers() {
        int lastNumber = 0;

        for (int i = 0; i <= 10; i = i + 1) {
            String share = (i % 5 == 0 && i != 0) ? " Делиться на 5, равно: " + (i / 5) : "";
            System.out.println(i + share);
            lastNumber = i;
        }
        System.out.println("Последний номер: " + lastNumber);
    }

    void bred() {
        Bred bred = new Bred();
        bred.buyBred("черный", 45);
        bred.printBred();
    }
}