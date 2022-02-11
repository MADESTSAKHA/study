import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    //Регулярные выражения
    static void regularExpressions() {
        System.out.println("==============Проверка соответствия строк===============");
        String number = "Т860ЕМ14";

        String letterList = "[АВЕКМНОРСТУХВ]";
        String regex = letterList + "[0-9]{3}" + letterList + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));

        System.out.println("\n==============Поиск соответствий в строке===============");

        String text = "Алексей, добрый день!\nМой гитхаб - https://github.com/, а так же ссылка на мой персональный" +
                " сайт - https://www.skillbox.ru/\nЕсли возникнут вопросыб пишите мне напрямую. Я всегда доступен" +
                " http://github.com/";

        String regex2 = "https?:\\/\\/[^,\\s]+";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println(text.substring(start, end));
        }

        System.out.println("\n=============Разбиение строки на фрагменты==============");
        String text2 = "I      know something    about                it";
        String[] words = text2.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\n=======Замена в строке одних фрагментов на другие=======");
        String phone1 = "+7 914 273-44-33";
        String phone2 = "7 914 273-44-33";
        String phone3 = "7 (914) 273-44-33";
        String phone4 = "7914-273-44-33";
        String phone5 = "8(914)2734433";

        System.out.println(formatPhoneNumber(phone1));
        System.out.println(formatPhoneNumber(phone2));
        System.out.println(formatPhoneNumber(phone3));
        System.out.println(formatPhoneNumber(phone4));
        System.out.println(formatPhoneNumber(phone5));
    }

    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        String regex2 = phone.replaceAll(regex, "");
        return regex2.replaceFirst("[7,8]", "+7");
    }
}