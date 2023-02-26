package practice;

import java.util.*;

public class CoolNumbers {


    public static ArrayList<String> allCoolNumberCar = new ArrayList<>();
    public static final String[] letter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};

    public static int firstL = 0;
    public static String firstLetter = letter[firstL];

    public static int numberCar = 111;

    public static int secondL = 0;
    public static String secondLetter = letter[secondL];

    public static int thirdL = 0;
    public static String thirdLetter = letter[thirdL];

    public static int regionCar = 1;

    public static List<String> generateCoolNumbers() {
//        System.out.printf("%s - %s - %s - %s - %03d" + "\n", firstLetter, numberCar, secondLetter, thirdLetter, regionCar);
//        System.out.println(firstLetter);
//        System.out.println(numberCar);
//        System.out.println(secondLetter);
//        System.out.println(thirdLetter);
//        System.out.println(regionCar);
//        regionCar();

        for (int i = regionCar; firstL < letter.length; i++) {
//            System.out.println(letter.length + " - " + i + " " + letter[i]);
            if (regionCar < 200) {
                allCoolNumberCar.add(String.format("%s - %s - %s - %s - %03d" + "\n", firstLetter, numberCar, secondLetter, thirdLetter, regionCar));
            } allCoolNumberCar();
        }


        return Collections.emptyList();
    }

/*
    public static void regionCar() {
        if (regionCar <= 199) {
            allCoolNumberCar.add(String.format("%s%s%s%s%03d", firstLetter, numberCar, secondLetter, thirdLetter, regionCar));
            regionCar++;
            regionCar();
        } else {
            regionCar = 1;
            thirdLetter();
        }
    }

    public static void thirdLetter() {
        if (thirdL < (letter.length - 1)) {
            thirdL++;
            thirdLetter = letter[thirdL];
            regionCar = 1;
            regionCar();
        } else {
            thirdL = 0;
            regionCar = 1;
            secondLetter();
            System.out.println("\t\t\tЗапуск secondLetter");
        }
    }

    public static void secondLetter() {
        if (secondL < (letter.length - 1)) {
            secondL++;
            secondLetter = letter[secondL];
            regionCar = 1;
            regionCar();
        } else {
            secondL = 0;
            thirdL = 0;
            allCoolNumberCar();
//            numberCar();
        }
    }

    public static void numberCar() {
        if (numberCar <= 999) {
            numberCar += 111;
            regionCar = 1;
            regionCar();
        } else {
            numberCar = 111;
            secondL = 0;
            thirdL = 0;
            regionCar = 0;
            firstLetter();
        }
    }

        public static void firstLetter() {
        if (firstL < (letter.length - 1)) {
            firstLetter = letter[firstL];
            firstL++;
            regionCar = 1;
            regionCar();
        } else {
            regionCar = 199;
        }
    }
*/

    private static void allCoolNumberCar() {
//        for (String s : allCoolNumberCar) {
//            System.out.println(s);
//        }
        System.out.println("Все бля!");
        System.out.println(allCoolNumberCar.size());
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        return Collections.binarySearch(sortedList, number) >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }
}
