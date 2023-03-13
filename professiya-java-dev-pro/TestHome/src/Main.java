import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> places = new ArrayList<>();

    // заполнение данными
    public static List getPlaces() {

        // добавление страны и города
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Фильтрация городов
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));

    }
}

//        System.out.println("\n<<<=================================Replace===============================================>>>\n");
//        Replace.replace();

//        System.out.println("\n<<<=================================RandomS===============================================>>>\n");
//        RandomS.randomS();

//        System.out.println("\n<<<==============\033[38;2;255;0;255mColor text\u001B[0m==============>>>");
//        System.out.println("<<<==============\033[1;31mColor text\u001B[0m==============>>>\n");
//        ColorText.colorText();

//        System.out.println("\n<<<=================================minMaxValue===============================================>>>\n");
//        MinMaxValue.minMaxValue();

//        System.out.println("\n<<<===============================Область видимости===========================================>>>\n");
//        PrintEvenNumbers.printEvenNumbers();

//        System.out.println("\n<<<===============================Char Symbol Unicode=========================================>>>\n");
//        CharSymbolUnicode.charSymbolUnicode();

//        System.out.println("\n<<<=============================Точность вычислений===========================================>>>\n");
//        AccuracyOfCalculations.accuracyOfCalculations();

//        System.out.println("\n<<<=============Работа с большими и точными числами bigInteger и bigDecimal===================>>>\n");
//        LargeAndPreciseNumbers.bigInteger();
//        LargeAndPreciseNumbers.bigDecimal();

//        System.out.println("\n<<<==================================DateAndTime==============================================>>>\n");
//        DateAndTime.dateAndTime();

//        System.out.println("\n<<<===========================Метка времени (timestamp)=======================================>>>\n");
//        TimeStamp.timestamp();

//        System.out.println("\n<<<=============================Строки, конкатенация и сравнение==============================>>>\n");
//        Strings.string();

//        System.out.println("\n<<<==========================Преобразование чисел в строки и обратно==========================>>>\n");
//        ConvertNumToStringsAndBack.convertToText();
//        ConvertNumToStringsAndBack.convertToNumb();

//        System.out.println("\n<<<====================================Символы и кодировки====================================>>>\n");
//        SymbolsAndEncodings.symbolsAndEncodings();

//        System.out.println("\n<<<================================Методы работы с подстроками================================>>>\n");
//        Substrings.substrings();

//        System.out.println("\n<<<========================================String Pool========================================>>>\n");
//        StringPool.stringPool();

//        System.out.println("\n<<<===================================Регулярные выражения====================================>>>\n");
//        RegularExpressions.regularExpressions();

//        System.out.println("\n<<<===================================Массивы и коллекции=====================================>>>\n");
//        ArraysAndCollections.arraysAndCollections();

//        System.out.println("\n<<<===================================Массивы массивов=====================================>>>\n");
//        ArraysOfArrays.arraysOfArrays();

//        System.out.println("\n<<<===================================Списки элементов=====================================>>>\n");
//        ArraysListS.arraysListS();

//        System.out.println("\n<<<=================================Методы сортировки======================================>>>\n");
//        BubbleSort.bubbleSort();
//        SortArrays.sortArrays();

//        System.out.println("\n<<<================Регулярные выражения (Поиск и исключения не нужного)=====================>>>\n");
//        RegexMail.regexMail();

//        HashMap2.hashMap();

//        RegularExpressions.regularExpressions();

//        Delete.delete();