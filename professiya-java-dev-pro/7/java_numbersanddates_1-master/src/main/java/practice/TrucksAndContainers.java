package practice;
import java.util.Scanner;

public class TrucksAndContainers {
    private static final int MAX_CONTAINER_IN_TRUCK = 12;       // Максимально количество контейнеров в грузовике.
    private static final int MAX_BOX_IN_CONTAINER = 27;         // Максимально количество коробок в контейнере.

    private static int countTruck;                              // Счетчик грузовиков
    private static int countContainer;                          // Счетчик контейнеров
    private static int countBox;                                // Счетчик коробок
    private static int countBoxReset;                           // Счетчик до сброса, счетчика коробок

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int boxes = scanner.nextInt();

        while (countBox < boxes) {
            if (countContainer % MAX_CONTAINER_IN_TRUCK == 0) {
                countTruck++;
                System.out.println("Грузовик: " + countTruck);
            }

            if (countBox % MAX_BOX_IN_CONTAINER == 0) {
                countContainer++;
                System.out.println("\tКонтейнер: " + countContainer);
            }

            while (MAX_BOX_IN_CONTAINER > countBoxReset) {
                countBoxReset++;
                countBox++;
                if (boxes >= countBox) {
                    System.out.println("\t\tЯщик: " + countBox);
                }
            }
            countBoxReset = 0;
        }
        finishMessage();
        clear();
    }

    public static void finishMessage() {          // Финишное сообщение.
        System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + countTruck +
                " шт." + System.lineSeparator() + "контейнеров - " + countContainer + " шт.");
    }

    public static void clear() {                  // Сброс счетчиков.
        countBox = 0;
        countContainer = 0;
        countTruck = 0;
    }
}