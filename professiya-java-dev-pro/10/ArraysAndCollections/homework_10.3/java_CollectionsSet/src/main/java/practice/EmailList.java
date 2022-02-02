package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    private final TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод

        final String string = email.toLowerCase();                            //email теперь string c маленькими буквами
        final String regex = "^[\\w_-]+@{1,1}[\\w]+\\.{1,1}[\\w$]+";          //Условие сравнения

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);    //Шаблон
        final Matcher matcher = pattern.matcher(string);                      //Сопоставитель

        if (matcher.find()) {
            if (!emailList.contains(string)) {
                emailList.add(string);
                System.out.println(Main.ANSI_PURPLE + "\n\t\temail: " + string + " - добавлен" + Main.ANSI_RESET);
            } else {
                System.out.println(Main.ANSI_RED + "\n\t\temail: " + string + " - уже есть в списке" + Main.ANSI_RESET);
            }
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER + ": " + string);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        List<String> sortEmails = new ArrayList<>(emailList);
        Collections.sort(sortEmails);
        return sortEmails;
    }
}

//    public List<String> getSortedEmails() {
//        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
//        return new ArrayList<>(emailList);
//    }