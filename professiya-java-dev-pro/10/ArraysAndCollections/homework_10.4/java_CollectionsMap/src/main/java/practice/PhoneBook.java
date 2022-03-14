package practice;

import java.util.*;

public class PhoneBook {

    private final Map<String, String> phoneBook = new TreeMap<>();
    private final TreeSet<String> phones = new TreeSet<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомендуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        if (name.matches(Main.NAME_REGEX) && phone.matches(Main.PHONE_REGEX)) {
            if (!phoneBook.containsKey(name) && !getByPhone(phone).equals(phone)) {
                phoneBook.put(name, phone);
            } else if (!phoneBook.containsKey(name) && getByPhone(phone).equals(phone)) {
                phoneBook.remove(getANameOnThePhone(phone), phone);
                phoneBook.put(name, phone);
            } else if (phoneBook.containsKey(name) && getByPhone(phone).isEmpty()) {
                String firstNumber = String.valueOf(getPhoneByName(name));
                phones.add(firstNumber + ", " + phone);
                phoneBook.put(name, String.valueOf(phones));
            }
        }
    }

    public String getByPhone(String phone) {                                                           // по № выдает: №
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                result = entry.getValue().replaceAll("\\[|\\]", "");
            }
        }
        return result;
    }

    public String getANameOnThePhone(String phone) {                                                 // по № выдает: ИМЯ
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                result = entry.getKey();
            }
        }
        return result;
    }

    public String getPhoneByName(String name) {                                                    // по ИМЕНИ выдает: №
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(name)) {
                result = entry.getValue().replaceAll("\\[|\\]", "");
            }
        }
        return result;
    }

    public String getNameByName(String name) {                                                   // по ИМЕНИ выдает: ИМЯ
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(name)) {
                result = entry.getKey().replaceAll("\\[|\\]","");
            }
        }
        return result;
    }

    public String getContactByPhone(String phone) {                                              // по № выдает: ИМЯ и №
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String key;
        String value;
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                key = entry.getKey();
                value = entry.getValue();
                result = key + " - " + value.replaceAll("\\[|\\]", "");
            }
        }
        return result;
    }

    public Set<String> getContactByName(String name) {                                       // по ИМЕНИ выдает: ИМЯ и №
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        String key;
        String value;
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getKey().contains(name)) {
                key = entry.getKey();
                value = entry.getValue();
                result = key + " - " + value.replaceAll("\\[|\\]", "");
            }
        }
        return Collections.singleton(result);
    }

    public Set<String> getAllContacts() {                                                                     // All nah
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        TreeSet<String> treeSetAll = new TreeSet<>();
        if (!phoneBook.isEmpty()) {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue().replaceAll("\\[|\\]", "");
                treeSetAll.add(key + " - " + value);
            }
        }
        return treeSetAll;
    }

    // для обхода Map используйте получение пары ключ->значение Map.Entry<String,String>
    // это поможет вам найти все ключи (key) по значению (value)
    /*
        for (Map.Entry<String, String> entry : map.entrySet()){
            String key = entry.getKey(); // получения ключа
            String value = entry.getValue(); // получения ключа
        }
    */
}