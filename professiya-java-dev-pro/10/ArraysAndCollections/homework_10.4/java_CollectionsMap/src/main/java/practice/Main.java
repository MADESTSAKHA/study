package practice;

import java.util.*;

public class Main {
    public static final String NAME_REGEX = "^[a-zA-Zа-яА-Я]+$";
    public static final String PHONE_REGEX = "^[+789]\\d{9,11}$";
    public static PhoneBook phoneBook = new PhoneBook();
    public static Scanner scanner = new Scanner(System.in);

    public static String name = "";
    public static String phone = "";

    public static final String SAVE_CONTACT = "Контакт сохранен!";
    public static final String WRONG_INPUT_FORMAT = "\n\t\tНеверный формат ввода!";

    public static void main(String[] args) {
        while (true) {

            System.out.print("\nВведите номер, имя или команду LIST: ");
            String input = scanner.nextLine();

            if (!input.isEmpty()) {                                                             // ! Проверка на пустоту
                switch (input.toUpperCase()) {
                    case "ДШЫЕ":                                       // ? Если случайно набрали слово LIST на ЛАТИНИЦЕ
                    case "LIST":
                        if (phoneBook.getAllContacts().isEmpty()) {                             // ! Проверка на пустоту
                            System.out.println("\n\t\tСписок телефонной книги пуст.");
                            break;
                        }
                        System.out.println(phoneBook.getAllContacts());
                        break;
                    default:
                        if (input.matches(NAME_REGEX)) {
                            addName(input);
                        } else if (input.matches(PHONE_REGEX)) {
                            addPhone(input);
                        } else {
                            System.out.println(WRONG_INPUT_FORMAT);
                        }
                }
                continue;
            }
            System.out.println("\n\t\tВы ничего не ввели!");
        }
    }

    public static void addName(String input) {
        name = input;
        if (!phoneBook.getNameByName(name).equals(name)) {
            System.out.println("Такого имени в телефонной книге нет.");
            System.out.print("Введите номер телефона для абонента “" + name + "”: ");
            String phone = scanner.nextLine();
            if (!phoneBook.getByPhone(phone).equals(phone) && phone.matches(PHONE_REGEX)) {
                phoneBook.addContact(phone, name);
                System.out.println(SAVE_CONTACT);
            } else {
                System.out.println(WRONG_INPUT_FORMAT);
            }
        } else {
            System.out.println("Абонент: " + phoneBook.getNameByName(name) + " - уже есть, его №: "
                    + phoneBook.getPhoneByName(name) + "\n Хотите добавить к абоненту еще номер?");
            System.out.print("\nВведите номер телефона для абонента “" + name + "”\n или для отменны нажмите Enter: ");
            String phone = scanner.nextLine();
            if (phone.matches(PHONE_REGEX)) {
                if (!phone.isEmpty() && phoneBook.getByPhone(phone).isEmpty()) {
                    phoneBook.addContact(phone, name);
                    System.out.println(SAVE_CONTACT);
                } else {
                    if (!phone.isEmpty()) {
                        System.out.println("У абонента: " + name + " - уже есть №: " + phone);
                    }  // ! Если ни чего не ввели, ни чего не делать!
                }
            } else {
                System.out.println(WRONG_INPUT_FORMAT);
            }
        }
    }

    private static void addPhone(String input) {
        phone = input;
        if (phoneBook.getByPhone(phone).isEmpty()) {                                              // ! Если нет ТЕЛЕФОНА
            System.out.println("Такого номера нет в телефонной книге.");
            System.out.print("Введите имя абонента для номера “" + phone + "”: ");
            String name = scanner.nextLine();
            if (name.matches(NAME_REGEX) && phoneBook.getNameByName(name).isEmpty()) {
                // ! Если нет Имени ИЛИ нет Телефона, проверка REGEX
                phoneBook.addContact(phone, name);
                System.out.println(SAVE_CONTACT);
            } else {
                if (!phoneBook.getNameByName(name).isEmpty() && !phoneBook.getByPhone(phone).equals(phone)) {
                    phoneBook.addContact(phone, name);
                    System.out.println(SAVE_CONTACT);
                } else {
                    System.out.println("\n\tНеверный формат ввода");
                }
            }
        } else {                                                                                      // * Если есть ИМЯ
            System.out.println("Абонент: " + phoneBook.getNameByName(name) + " - уже есть и его №: "
                    + phoneBook.getPhoneByName(name) + "\n Хотите добавить к абоненту еще номер?");
            System.out.print("\n - Введите номер телефона для абонента “" + phoneBook.getNameByName(name)
                    + "”\n\t отменны нажмите Enter: ");
            String phone = scanner.nextLine();
            if (!phone.isEmpty() && phone.matches(PHONE_REGEX) && !phoneBook.getPhoneByName(name).equals(phone)) {
                // ! Проверка на пустоту
                phoneBook.addContact(phone, phoneBook.getNameByName(name));
                System.out.println(SAVE_CONTACT);
            } else {
                if (!phoneBook.getPhoneByName(name).equals(phone)) {
                    System.out.println("\f" + WRONG_INPUT_FORMAT);
                }
            }
        }
    }
}