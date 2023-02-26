import java.util.StringJoiner;

public class Substrings {
            //Подстроки
            static void substrings() {
        System.out.println("=============Метод изъятия фрагмента текста=============");
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";

        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";

        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println(getEncoding(header4));
        System.out.println(getEncoding(header5));
        System.out.println(getEncoding(header6));

        System.out.println("\n==========Метод позволяющий объединять строки=========");
        String name1 = "Василий";
        String name2 = "Георгий";
        String name3 = "Алексей";

        StringJoiner joiner = new StringJoiner(", ");
        joiner.add(name1);
        joiner.add(name2);
        joiner.add(name3);
        System.out.println(joiner + " - Вариант №1");

        String list = String.join(", ", name1, name2, name3);
        System.out.println(list + " - Вариант №2");

        System.out.println("\n=================Форматирования строк=================");
        String name = "Тимурка";
        int birthYear = 2010;
        String template = "name: %s, birthYear: %d";                    // {"name" : "Максим", "Максим": "2010"}
        System.out.printf(template, name, birthYear).append(" - Вариант короткий\n");        // Вариант короткий

        String result = String.format(template, name, birthYear);                            // Вариант длинный
        System.out.println(result + " - Вариант длинный");
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(';', start);
        if (start < 0 || end < 0) {
            return "-";
        } else if (header.substring(start + charsetStr.length(), end).length() == 0) {                     // Отсебятина
            return " - пустая строка";
        }
        return header.substring(start + charsetStr.length(), end);
    }
}

/*
    public static String getEncoding(String header) {                                                  // Без отсебятины
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        int end = header.indexOf(';', start);
        if (start < 0 || end < 0) {
            return "-";
        }
        return header.substring(start + charsetStr.length(), end);
    }*/