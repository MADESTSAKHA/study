public class ConvertNumToStringsAndBack {
                //Преобразовать число в строки и обратно
    static void convertToText() {
        System.out.println("========Преобразование числа в текст (строку)========");
        int age = 37;
        String name = "Анна";
        String personInfo = name + " - " + age + " лет" + " - Автоматически преобразовалось в ТЕКСТ!";
        System.out.println(personInfo);
        String value = Integer.toString(age);
        System.out.println(value + " - Integer.toString(age) преобразовал в ТЕКСТ!");

        Double weight = 2.54;  // Double объект
        String value2 = String.valueOf(weight);
        System.out.println(value2 + " - преобразование ОБЪЕКТА в ТЕКСТ!");
    }

    static void convertToNumb() {
        System.out.println("\n========Преобразование строки в число========");
        String value = "4623784";
        String value2 = "1000";
        long count = Long.parseLong(value);
        int count2 = Integer.parseInt(value2);
        System.out.println(count * count2 + " - Преобразованный текст в число long: " + value +
                " и * на int: " + value2);
    }
}