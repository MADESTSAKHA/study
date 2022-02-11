package practice;

import java.util.*;

public class PhoneBook {
    Map<String, String> phoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        // (рекомендуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
        phoneBook.put(phone, name);
//        Scanner scanner = new Scanner(System.in);

//        if (phoneBook.containsValue(name) && phoneBook.containsKey(phone)) {
//            phoneBook.put(phone, name);
//            if (!phoneBook.containsValue(name)) {
//                System.out.print("Введите Имя абонента: ");
//                String inputName = scanner.nextLine();
//                phoneBook.put(phone, inputName);
//            }
//        }

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//            String key = entry.getKey(); // получения ключа
//            String value = entry.getValue(); // получения ключа
            System.out.println(phoneBook.size());
            System.out.println(entry.getValue() + " " + entry.getKey());
            System.out.println("Че за хня1 .containsKey \"79001234567\": " + phoneBook.containsKey("79001234567"));
            System.out.println("Че за хня2 .containsValue \"Маша\": " + phoneBook.containsValue("Маша"));
            System.out.println("Че за хня3: " + phoneBook.get("Маша"));
            System.out.println("Че за хня4: " + phoneBook.toString());
            System.out.println("Че за хня5: " + phoneBook.entrySet());
            System.out.println("Че за хня6: " + phoneBook.keySet());
            System.out.println("Че за хня7: " + phoneBook.values());
            System.out.println("Че за хня8: " + phoneBook.size());
            System.out.println("===================================");
        }
    }

    public String getContactByPhone(String phone) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найдены - вернуть пустую строку
        String result = "";
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (phoneBook.containsKey(phone)) {
                result = entry.getValue() + " - " + entry.getKey();
            }
        }
        return result;
    }

    public Set<String> getContactByName(String name) {
        // формат одного контакта "Имя - Телефон"
        // если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public Set<String> getAllContacts() {
        // формат одного контакта "Имя - Телефон"
        // если контактов нет в телефонной книге - вернуть пустой TreeSet
        return new TreeSet<>();
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