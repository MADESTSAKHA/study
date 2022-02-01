public class ArraysAndCollections {
    //Массивы и коллекции
    static void arraysAndCollections() {
        System.out.println("====================Создание массивов===================");
        int[] roomCounts = new int[6];                                             // Вариант №1

        roomCounts[0] = 5;
        roomCounts[1] = 45;
        roomCounts[2] = 34;
        roomCounts[3] = 28;

        for (int i = 0; i < roomCounts.length; i++) {
            System.out.println(roomCounts[i]);
        }

        System.out.println("-----------------------------------------");
        int[] roomCounts2 = {5, 45, 34, 25, 0, 0};                                 // Вариант №2

        for (int i = 0; i < roomCounts2.length; i++) {
            System.out.println(roomCounts2[i]);
        }

        System.out.println("-----------------------------------------");
        String[] colors = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("-----------------------------------------");
        String text = "Красный Оранжевый Желтый Зеленый, Голубой Синий Фиолетовый";
        String[] colors2 = text.split(",?\\s+");
        for (int i = 0; i < colors2.length; i++) {
            System.out.println(colors2[i]);
        }

        System.out.println("===============Перебор элементов массивов===============");
        int[] ticketNumber = new int[1000];
        int[] winTicket = new int[10];
        for (int i = 0; i < ticketNumber.length; i++) {
            int value = 1000000 + (int) Math.round(1000000 * Math.random());
            if (i % 100 == 0) {
                winTicket[i / 100] = value;
            }
//            ticketNumber[i] = value;
        }
        for (int i = 0; i < winTicket.length; i++) {
            System.out.println(i + 1 + " - " + winTicket[i]);
        }

        System.out.println("============Обход массивов в обратном порядке===========");
        String text2 = "Красный Оранжевый Желтый Зеленый, Голубой Синий Фиолетовый";
        String[] colors3 = text2.split(",?\\s+");
        for (int i = colors3.length - 1; i >= 0; i--) {
            System.out.println(colors3[i]);
        }

        System.out.println("=======Сравнение предыдущего и следующего элемента======");
        String text3 = "Оранжевый Желтый Желтый Зеленый, Голубой Синий, Фиолетовый Красный Красный";
        String[] colors4 = text3.split(",?\\s+");

        for (int i = 0; i < colors4.length; i++) {
            if (i > 0 && colors4[i].equals(colors4[i - 1])) {
                continue;
            }
            System.out.println(colors4[i]);
        }
    }
}